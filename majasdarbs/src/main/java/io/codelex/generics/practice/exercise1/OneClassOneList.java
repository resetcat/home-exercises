package io.codelex.generics.practice.exercise1;

import java.math.BigDecimal;
import java.util.List;

public class OneClassOneList {

    private List<BigDecimal> bigD;

    public OneClassOneList(List<BigDecimal> bigD) {
        this.bigD = bigD;
    }

    public void add(int i, Object el) {
        bigD.add(i, (BigDecimal) el);
    }

    public Object get(int i) {
        return bigD.get(i);
    }

}
