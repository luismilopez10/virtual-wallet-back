package com.sofkau.virtualwallet;

import com.sofkau.virtualwallet.mapper.WalletMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VirtualWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualWalletApplication.class, args);
	}

	@Bean
	public WalletMapper WalletMapper(){
		return new WalletMapper();
	}

}
