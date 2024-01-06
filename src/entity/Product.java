package entity;

import java.util.UUID;

public record Product(UUID id,String name, double price, int quantity) {
}
