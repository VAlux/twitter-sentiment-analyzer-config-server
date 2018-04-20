package com.alvo.twittersentimentanalyzerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TwitterSentimentAnalyzerConfigServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(TwitterSentimentAnalyzerConfigServerApplication.class, args);
  }
}
