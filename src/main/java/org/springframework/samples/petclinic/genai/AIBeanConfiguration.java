package org.springframework.samples.petclinic.genai;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * A Configuration class for beans used by the Chat Client.
 *
 * @author Oded Shopen
 */
@Configuration
public class AIBeanConfiguration {

	@Bean
	VectorStore vectorStore(EmbeddingModel embeddingModel) {
		return new SimpleVectorStore(embeddingModel);
	}

}
