package br.com.xti.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
public @interface Cabeçalho {
	
	String instituicao();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1;
	
}
