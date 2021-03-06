package pl.altkom.asc.lab.micronaut.poc.pricing.service.api.v1.commands.calculateprice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CalculatePriceResult {
    private BigDecimal totalPrice;
    private Map<String, BigDecimal> coversPrices;

    public static CalculatePriceResult empty() {
        return new CalculatePriceResult();
    }
}
