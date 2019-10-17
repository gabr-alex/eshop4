package eshop.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.util.UrlPathHelper;

@Configuration
@EnableWebMvc
@ComponentScan("eshop")
public class WebApplicationContextConfig implements WebMvcConfigurer {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// Reikia įjungti jei naudojame nestandartinius @RequestMapping'us
		configurer.enable();
	}

	// Pakeičiame nustatymus, kad iš URL nebūtu naikinamas kabliataškis
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		UrlPathHelper urlPathHelper = new UrlPathHelper();
		urlPathHelper.setRemoveSemicolonContent(false);
		configurer.setUrlPathHelper(urlPathHelper);
	}

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		// Konfiguruojame JSP failų paėmimo vietą ir galūnę
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class); // Nurodoma view klasė - JSP tipas
		resolver.setPrefix("/WEB-INF/jsp/"); // Dėl saugumo rekomenduojama view failus laikyti WEB-INF kataloge
		resolver.setSuffix(".jsp"); // Nurodoma view failų galūnė
		return resolver;
	}
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
		resource.setBasename("messages"); // Properties failo galūnė nėra reikalinga
		return resource;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// ** reiškia, kad resursai ieškomi rekursiškai
		registry.addResourceHandler("/img/**").addResourceLocations("/resources/images/");
	}


	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("utf-8");
		resolver.setMaxUploadSize(10240000);
		return resolver;
	}
	}



