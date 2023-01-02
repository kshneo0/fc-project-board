package com.fastcampus.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

/**
 * author :  sanghoonkim
 * date : 2023/01/02
 */
@EnableJpaAuditing
@Configuration
public class JpaConfig {


    /**
     * Auditing에서 사용자를 입력하기 위해 작성.
     * 스프링 시큐리티가 구현되면 수정.
     * @return
     */
    @Bean
    public AuditorAware<String> auditorAware(){
        return () -> Optional.of("kshneo"); //TODO: 스프링 시큐리티로 인증 기능을 붙이게 될 때, 수정하자.
    }
}
