package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        radius = radius.pow(2).multiply(BigDecimal.valueOf(Math.PI));
        return radius.setScale(2, RoundingMode.HALF_EVEN);

    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width).setScale(2, RoundingMode.HALF_EVEN);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.multiply(h).multiply(BigDecimal.valueOf(0.5)).setScale(2, RoundingMode.HALF_EVEN);
    }
}
