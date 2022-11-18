package io.codelex.oop.imperialToMetric;

public class convertMain {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter(50, ConversionType.KILOMETERS_TO_MILES);

        converter.getConvertedValue();
        converter.setConversionType(ConversionType.CENTIMETERS_TO_INCHES);
        converter.getConvertedValue();
        converter.setValue(123);
        converter.setConversionType(ConversionType.YARDS_TO_METERS);
        converter.getConvertedValue();

    }
}
