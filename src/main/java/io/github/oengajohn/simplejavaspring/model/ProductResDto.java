package io.github.oengajohn.simplejavaspring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResDto {
    private String productId;
    private String productName;
    private String productCode;
}
