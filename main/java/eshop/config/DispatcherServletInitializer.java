package eshop.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Atliekame servleto inicializaciją paveldint ...Initializer klasę
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Nurodome programos duomenų inicializavimo klasę kaip parametrą
		return new Class[] {RootApplicationContextConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Nurodome mūsų implementuotą konfiguracinę klasę kaip parametrą
		return new Class[] { WebApplicationContextConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// Nurodome pradžios užklausos susiejimą - request mapping'ą
		return new String[] { "/" }; // Galima pridėti /app/* - prefiksą
	}

}
