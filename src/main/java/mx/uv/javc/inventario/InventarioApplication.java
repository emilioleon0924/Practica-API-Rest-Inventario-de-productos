package mx.uv.javc.inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import mx.uv.javc.inventario.entity.Producto;
import mx.uv.javc.inventario.repository.ProductoRepository;

@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(ProductoRepository repository) {
		return args -> {
			repository.save(new Producto(null, "Laptop Dell", "i7 16RAM", 15500.50, 5, "Electronica", null));
			repository.save(new Producto(null, "Mouse", "Mouse inalambrico", 500.50, 50, "Electronica", null));
			repository.save(new Producto(null, "Audifonos", "Sony ", 1500.50, 1, "Electronica", null));
		};
	}
}
