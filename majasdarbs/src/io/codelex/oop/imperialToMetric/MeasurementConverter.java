package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {

    private int value;

    ConversionType conversionType;

    public MeasurementConverter(int value, ConversionType conversionType) {
        this.value = value;
        this.conversionType = conversionType;
    }

    public void getConvertedValue() {
        System.out.println("Converting " + value + " " + conversionType.name().toLowerCase().replaceAll("_", " ")
                + " is " + (int) (conversionType.converter * value));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ConversionType getConversionType() {
        return conversionType;
    }

    public void setConversionType(ConversionType conversionType) {
        this.conversionType = conversionType;
    }
}
