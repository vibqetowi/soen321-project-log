package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.recyclerview.widget.k;
import com.appsflyer.R;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import com.theinnerhour.b2b.utils.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes.dex */
public abstract class NumberConverter {
    private static final BigDecimal BD_MAX_LONG;
    private static final BigDecimal BD_MIN_LONG;
    private static final byte MINUS = 45;
    private static final byte[] MIN_INT;
    private static final byte[] MIN_LONG;
    public static final short[] SHORT_EMPTY_ARRAY = new short[0];
    public static final int[] INT_EMPTY_ARRAY = new int[0];
    public static final long[] LONG_EMPTY_ARRAY = new long[0];
    public static final float[] FLOAT_EMPTY_ARRAY = new float[0];
    public static final double[] DOUBLE_EMPTY_ARRAY = new double[0];
    public static final Short SHORT_ZERO = 0;
    public static final Integer INT_ZERO = 0;
    public static final Long LONG_ZERO = 0L;
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    private static final int[] DIGITS = new int[1000];
    private static final int[] DIFF = {R.styleable.AppCompatTheme_textColorSearchUrl, 222, 444, 888, 1776};
    private static final int[] ERROR = {50, 100, k.d.DEFAULT_DRAG_ANIMATION_DURATION, 400, 800};
    private static final int[] SCALE_10 = {Constants.TIMEOUT_MS, 1000, 100, 10, 1};
    private static final double[] POW_10 = {10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d, 1.0E23d, 1.0E24d, 1.0E25d, 1.0E26d, 1.0E27d, 1.0E28d, 1.0E29d, 1.0E30d, 1.0E31d, 1.0E32d, 1.0E33d, 1.0E34d, 1.0E35d, 1.0E36d, 1.0E37d, 1.0E38d, 1.0E39d, 1.0E40d, 1.0E41d, 1.0E42d, 1.0E43d, 1.0E44d, 1.0E45d, 1.0E46d, 1.0E47d, 1.0E48d, 1.0E49d, 1.0E50d, 1.0E51d, 1.0E52d, 1.0E53d, 1.0E54d, 1.0E55d, 1.0E56d, 1.0E57d, 1.0E58d, 1.0E59d, 1.0E60d, 1.0E61d, 1.0E62d, 1.0E63d, 1.0E64d, 1.0E65d};
    public static final JsonReader.ReadObject<Double> DOUBLE_READER = new JsonReader.ReadObject<Double>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Double read(JsonReader jsonReader) {
            return Double.valueOf(NumberConverter.deserializeDouble(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Double> NULLABLE_DOUBLE_READER = new JsonReader.ReadObject<Double>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Double read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Double.valueOf(NumberConverter.deserializeDouble(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Double> DOUBLE_WRITER = new JsonWriter.WriteObject<Double>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.3
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, Double d10) {
            NumberConverter.serializeNullable(d10, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<double[]> DOUBLE_ARRAY_READER = new JsonReader.ReadObject<double[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.4
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public double[] read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                jsonReader.getNextToken();
                return NumberConverter.deserializeDoubleArray(jsonReader);
            }
            throw jsonReader.newParseError("Expecting '[' for double array start");
        }
    };
    public static final JsonWriter.WriteObject<double[]> DOUBLE_ARRAY_WRITER = new JsonWriter.WriteObject<double[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.5
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, double[] dArr) {
            NumberConverter.serialize(dArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<Float> FLOAT_READER = new JsonReader.ReadObject<Float>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.6
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Float read(JsonReader jsonReader) {
            return Float.valueOf(NumberConverter.deserializeFloat(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Float> NULLABLE_FLOAT_READER = new JsonReader.ReadObject<Float>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.7
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Float read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Float.valueOf(NumberConverter.deserializeFloat(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Float> FLOAT_WRITER = new JsonWriter.WriteObject<Float>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.8
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, Float f) {
            NumberConverter.serializeNullable(f, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<float[]> FLOAT_ARRAY_READER = new JsonReader.ReadObject<float[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.9
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public float[] read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                jsonReader.getNextToken();
                return NumberConverter.deserializeFloatArray(jsonReader);
            }
            throw jsonReader.newParseError("Expecting '[' for float array start");
        }
    };
    public static final JsonWriter.WriteObject<float[]> FLOAT_ARRAY_WRITER = new JsonWriter.WriteObject<float[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.10
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, float[] fArr) {
            NumberConverter.serialize(fArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<Integer> INT_READER = new JsonReader.ReadObject<Integer>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.11
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Integer read(JsonReader jsonReader) {
            return Integer.valueOf(NumberConverter.deserializeInt(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Integer> NULLABLE_INT_READER = new JsonReader.ReadObject<Integer>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.12
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Integer read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Integer.valueOf(NumberConverter.deserializeInt(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Integer> INT_WRITER = new JsonWriter.WriteObject<Integer>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.13
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, Integer num) {
            NumberConverter.serializeNullable(num, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<int[]> INT_ARRAY_READER = new JsonReader.ReadObject<int[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.14
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public int[] read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                jsonReader.getNextToken();
                return NumberConverter.deserializeIntArray(jsonReader);
            }
            throw jsonReader.newParseError("Expecting '[' for int array start");
        }
    };
    public static final JsonWriter.WriteObject<int[]> INT_ARRAY_WRITER = new JsonWriter.WriteObject<int[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.15
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, int[] iArr) {
            NumberConverter.serialize(iArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<Short> SHORT_READER = new JsonReader.ReadObject<Short>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.16
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Short read(JsonReader jsonReader) {
            return Short.valueOf(NumberConverter.deserializeShort(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Short> NULLABLE_SHORT_READER = new JsonReader.ReadObject<Short>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.17
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Short read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Short.valueOf(NumberConverter.deserializeShort(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Short> SHORT_WRITER = new JsonWriter.WriteObject<Short>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.18
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, Short sh2) {
            if (sh2 == null) {
                jsonWriter.writeNull();
            } else {
                NumberConverter.serialize(sh2.intValue(), jsonWriter);
            }
        }
    };
    public static final JsonReader.ReadObject<short[]> SHORT_ARRAY_READER = new JsonReader.ReadObject<short[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.19
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public short[] read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                jsonReader.getNextToken();
                return NumberConverter.deserializeShortArray(jsonReader);
            }
            throw jsonReader.newParseError("Expecting '[' for short array start");
        }
    };
    public static final JsonWriter.WriteObject<short[]> SHORT_ARRAY_WRITER = new JsonWriter.WriteObject<short[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.20
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, short[] sArr) {
            NumberConverter.serialize(sArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<Long> LONG_READER = new JsonReader.ReadObject<Long>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.21
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Long read(JsonReader jsonReader) {
            return Long.valueOf(NumberConverter.deserializeLong(jsonReader));
        }
    };
    public static final JsonReader.ReadObject<Long> NULLABLE_LONG_READER = new JsonReader.ReadObject<Long>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.22
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Long read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return Long.valueOf(NumberConverter.deserializeLong(jsonReader));
        }
    };
    public static final JsonWriter.WriteObject<Long> LONG_WRITER = new JsonWriter.WriteObject<Long>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.23
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, Long l2) {
            NumberConverter.serializeNullable(l2, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<long[]> LONG_ARRAY_READER = new JsonReader.ReadObject<long[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.24
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public long[] read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                jsonReader.getNextToken();
                return NumberConverter.deserializeLongArray(jsonReader);
            }
            throw jsonReader.newParseError("Expecting '[' for long array start");
        }
    };
    public static final JsonWriter.WriteObject<long[]> LONG_ARRAY_WRITER = new JsonWriter.WriteObject<long[]>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.25
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, long[] jArr) {
            NumberConverter.serialize(jArr, jsonWriter);
        }
    };
    public static final JsonReader.ReadObject<BigDecimal> DecimalReader = new JsonReader.ReadObject<BigDecimal>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.26
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public BigDecimal read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return NumberConverter.deserializeDecimal(jsonReader);
        }
    };
    public static final JsonWriter.WriteObject<BigDecimal> DecimalWriter = new JsonWriter.WriteObject<BigDecimal>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.27
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) {
            NumberConverter.serializeNullable(bigDecimal, jsonWriter);
        }
    };
    static final JsonReader.ReadObject<Number> NumberReader = new JsonReader.ReadObject<Number>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.NumberConverter.28
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
        public Number read(JsonReader jsonReader) {
            if (jsonReader.wasNull()) {
                return null;
            }
            return NumberConverter.deserializeNumber(jsonReader);
        }
    };

    /* loaded from: classes.dex */
    public static class NumberInfo {
        final char[] buffer;
        final int length;

        public NumberInfo(char[] cArr, int i6) {
            this.buffer = cArr;
            this.length = i6;
        }
    }

    static {
        int i6;
        int i10 = 0;
        while (true) {
            int[] iArr = DIGITS;
            if (i10 < iArr.length) {
                if (i10 < 10) {
                    i6 = 33554432;
                } else if (i10 < 100) {
                    i6 = 16777216;
                } else {
                    i6 = 0;
                }
                iArr[i10] = (i10 % 10) + i6 + (((i10 / 100) + 48) << 16) + ((((i10 / 10) % 10) + 48) << 8) + 48;
                i10++;
            } else {
                MIN_INT = "-2147483648".getBytes();
                MIN_LONG = "-9223372036854775808".getBytes();
                BD_MAX_LONG = BigDecimal.valueOf(Long.MAX_VALUE);
                BD_MIN_LONG = BigDecimal.valueOf(Long.MIN_VALUE);
                return;
            }
        }
    }

    private static double approximateDouble(int i6, double d10, int i10) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i11 = ((int) (doubleToRawLongBits >> 52)) - 1022;
        return Double.longBitsToDouble(doubleToRawLongBits + (((i6 * SCALE_10[i10 + 1]) + ERROR[i11]) / DIFF[i11]));
    }

    private static Number bigDecimalOrDouble(BigDecimal bigDecimal, JsonReader.UnknownNumberParsing unknownNumberParsing) {
        if (unknownNumberParsing != JsonReader.UnknownNumberParsing.LONG_AND_BIGDECIMAL) {
            return Double.valueOf(bigDecimal.doubleValue());
        }
        return bigDecimal;
    }

    public static BigDecimal deserializeDecimal(JsonReader jsonReader) {
        if (jsonReader.last() == 34) {
            return parseNumberGeneric(jsonReader.chars, jsonReader.parseString(), jsonReader, true);
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex = jsonReader.getCurrentIndex();
        if (currentIndex == jsonReader.length()) {
            NumberInfo readLongNumber = readLongNumber(jsonReader, scanNumber);
            return parseNumberGeneric(readLongNumber.buffer, readLongNumber.length, jsonReader, false);
        }
        int i6 = currentIndex - scanNumber;
        if (i6 > 18) {
            return parseNumberGeneric(jsonReader.prepareBuffer(scanNumber, i6), i6, jsonReader, false);
        }
        byte[] bArr = jsonReader.buffer;
        if (bArr[scanNumber] == 45) {
            return parseNegativeDecimal(bArr, jsonReader, scanNumber, currentIndex);
        }
        return parsePositiveDecimal(bArr, jsonReader, scanNumber, currentIndex);
    }

    public static ArrayList<BigDecimal> deserializeDecimalCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(DecimalReader);
    }

    public static ArrayList<BigDecimal> deserializeDecimalNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(DecimalReader);
    }

    public static double deserializeDouble(JsonReader jsonReader) {
        if (jsonReader.last() == 34) {
            return parseDoubleGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - jsonReader.getCurrentIndex()) - 1, jsonReader, true);
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex = jsonReader.getCurrentIndex();
        byte[] bArr = jsonReader.buffer;
        if (bArr[scanNumber] == 45) {
            return -parseDouble(bArr, jsonReader, scanNumber, currentIndex, 1);
        }
        return parseDouble(bArr, jsonReader, scanNumber, currentIndex, 0);
    }

    public static double[] deserializeDoubleArray(JsonReader jsonReader) {
        if (jsonReader.last() == 93) {
            return DOUBLE_EMPTY_ARRAY;
        }
        double[] dArr = new double[4];
        dArr[0] = deserializeDouble(jsonReader);
        int i6 = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i6 == dArr.length) {
                dArr = Arrays.copyOf(dArr, dArr.length << 1);
            }
            dArr[i6] = deserializeDouble(jsonReader);
            i6++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(dArr, i6);
    }

    public static ArrayList<Double> deserializeDoubleCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(DOUBLE_READER);
    }

    public static ArrayList<Double> deserializeDoubleNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(DOUBLE_READER);
    }

    public static float deserializeFloat(JsonReader jsonReader) {
        if (jsonReader.last() == 34) {
            return parseFloatGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - jsonReader.getCurrentIndex()) - 1, jsonReader, true);
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex = jsonReader.getCurrentIndex();
        if (currentIndex == jsonReader.length()) {
            NumberInfo readLongNumber = readLongNumber(jsonReader, scanNumber);
            return parseFloatGeneric(readLongNumber.buffer, readLongNumber.length, jsonReader, false);
        }
        byte[] bArr = jsonReader.buffer;
        if (bArr[scanNumber] == 45) {
            return -parseFloat(bArr, jsonReader, scanNumber, currentIndex, 1);
        }
        return parseFloat(bArr, jsonReader, scanNumber, currentIndex, 0);
    }

    public static float[] deserializeFloatArray(JsonReader jsonReader) {
        if (jsonReader.last() == 93) {
            return FLOAT_EMPTY_ARRAY;
        }
        float[] fArr = new float[4];
        fArr[0] = deserializeFloat(jsonReader);
        int i6 = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i6 == fArr.length) {
                fArr = Arrays.copyOf(fArr, fArr.length << 1);
            }
            fArr[i6] = deserializeFloat(jsonReader);
            i6++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(fArr, i6);
    }

    public static ArrayList<Float> deserializeFloatCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(FLOAT_READER);
    }

    public static ArrayList<Float> deserializeFloatNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(FLOAT_READER);
    }

    public static int deserializeInt(JsonReader jsonReader) {
        int i6;
        byte b10;
        byte b11;
        if (jsonReader.last() == 34) {
            int currentIndex = jsonReader.getCurrentIndex();
            try {
                return parseNumberGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - currentIndex) - 1, jsonReader, true).intValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.newParseErrorAt("Integer overflow detected", jsonReader.getCurrentIndex() - currentIndex);
            }
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex2 = jsonReader.getCurrentIndex();
        byte[] bArr = jsonReader.buffer;
        byte b12 = bArr[scanNumber];
        if (b12 == 45) {
            int i10 = scanNumber + 2;
            if (currentIndex2 > i10 && bArr[scanNumber + 1] == 48 && (b11 = bArr[i10]) >= 48 && b11 <= 57) {
                numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
            }
            return parseNegativeInt(bArr, jsonReader, scanNumber, currentIndex2);
        }
        if (b12 == 48 && currentIndex2 > (i6 = scanNumber + 1) && (b10 = bArr[i6]) >= 48 && b10 <= 57) {
            numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
        }
        return parsePositiveInt(bArr, jsonReader, scanNumber, currentIndex2, 0);
    }

    public static int[] deserializeIntArray(JsonReader jsonReader) {
        if (jsonReader.last() == 93) {
            return INT_EMPTY_ARRAY;
        }
        int[] iArr = new int[4];
        iArr[0] = deserializeInt(jsonReader);
        int i6 = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i6 == iArr.length) {
                iArr = Arrays.copyOf(iArr, iArr.length << 1);
            }
            iArr[i6] = deserializeInt(jsonReader);
            i6++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(iArr, i6);
    }

    public static ArrayList<Integer> deserializeIntCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(INT_READER);
    }

    public static ArrayList<Integer> deserializeIntNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(INT_READER);
    }

    public static long deserializeLong(JsonReader jsonReader) {
        if (jsonReader.last() == 34) {
            int currentIndex = jsonReader.getCurrentIndex();
            try {
                return parseNumberGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - currentIndex) - 1, jsonReader, true).longValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.newParseErrorAt("Long overflow detected", jsonReader.getCurrentIndex() - currentIndex);
            }
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex2 = jsonReader.getCurrentIndex();
        byte[] bArr = jsonReader.buffer;
        byte b10 = bArr[scanNumber];
        char c10 = 3;
        int i6 = 9;
        boolean z10 = false;
        byte b11 = 48;
        if (b10 == 45) {
            int i10 = scanNumber + 1;
            if (i10 == currentIndex2) {
                numberException(jsonReader, scanNumber, currentIndex2, "Digit not found");
            }
            if (bArr[i10] == 48) {
                z10 = true;
            }
            int i11 = i10;
            long j10 = 0;
            while (i11 < currentIndex2) {
                int i12 = bArr[i11] - 48;
                if (i12 >= 0 && i12 <= i6) {
                    j10 = ((j10 << c10) + (j10 << 1)) - i12;
                    if (j10 > 0) {
                        numberException(jsonReader, scanNumber, currentIndex2, "Long overflow detected");
                    }
                    i11++;
                    c10 = 3;
                    i6 = 9;
                } else {
                    if (z10 && i11 > scanNumber + 2) {
                        numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
                    }
                    if (i11 > i10 && jsonReader.allWhitespace(i11, currentIndex2)) {
                        return j10;
                    }
                    return parseLongGeneric(jsonReader, scanNumber, currentIndex2);
                }
            }
            if (z10 && i11 > scanNumber + 2) {
                numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
            }
            return j10;
        }
        if (scanNumber == currentIndex2) {
            numberException(jsonReader, scanNumber, currentIndex2, "Digit not found");
        }
        if (bArr[scanNumber] == 48) {
            z10 = true;
        }
        int i13 = scanNumber;
        long j11 = 0;
        while (i13 < currentIndex2) {
            int i14 = bArr[i13] - b11;
            if (i14 >= 0 && i14 <= 9) {
                j11 = (j11 << 3) + (j11 << 1) + i14;
                if (j11 < 0) {
                    numberException(jsonReader, scanNumber, currentIndex2, "Long overflow detected");
                }
                i13++;
                b11 = 48;
            } else {
                if (z10 && i13 > scanNumber + 1) {
                    numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
                }
                if (b10 == 43 && i13 > scanNumber + 1 && jsonReader.allWhitespace(i13, currentIndex2)) {
                    return j11;
                }
                if (b10 != 43 && i13 > scanNumber && jsonReader.allWhitespace(i13, currentIndex2)) {
                    return j11;
                }
                return parseLongGeneric(jsonReader, scanNumber, currentIndex2);
            }
        }
        if (z10 && i13 > scanNumber + 1) {
            numberException(jsonReader, scanNumber, currentIndex2, "Leading zero is not allowed");
        }
        return j11;
    }

    public static long[] deserializeLongArray(JsonReader jsonReader) {
        if (jsonReader.last() == 93) {
            return LONG_EMPTY_ARRAY;
        }
        long[] jArr = new long[4];
        jArr[0] = deserializeLong(jsonReader);
        int i6 = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i6 == jArr.length) {
                jArr = Arrays.copyOf(jArr, jArr.length << 1);
            }
            jArr[i6] = deserializeLong(jsonReader);
            i6++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(jArr, i6);
    }

    public static ArrayList<Long> deserializeLongCollection(JsonReader jsonReader) {
        return jsonReader.deserializeCollection(LONG_READER);
    }

    public static ArrayList<Long> deserializeLongNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(LONG_READER);
    }

    public static Number deserializeNumber(JsonReader jsonReader) {
        JsonReader.UnknownNumberParsing unknownNumberParsing = jsonReader.unknownNumbers;
        if (unknownNumberParsing == JsonReader.UnknownNumberParsing.BIGDECIMAL) {
            return deserializeDecimal(jsonReader);
        }
        if (unknownNumberParsing == JsonReader.UnknownNumberParsing.DOUBLE) {
            return Double.valueOf(deserializeDouble(jsonReader));
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex = jsonReader.getCurrentIndex();
        if (currentIndex == jsonReader.length()) {
            NumberInfo readLongNumber = readLongNumber(jsonReader, scanNumber);
            return tryLongFromBigDecimal(readLongNumber.buffer, readLongNumber.length, jsonReader);
        }
        int i6 = currentIndex - scanNumber;
        if (i6 > 18) {
            return tryLongFromBigDecimal(jsonReader.prepareBuffer(scanNumber, i6), i6, jsonReader);
        }
        byte[] bArr = jsonReader.buffer;
        if (bArr[scanNumber] == 45) {
            return parseNegativeNumber(bArr, jsonReader, scanNumber, currentIndex);
        }
        return parsePositiveNumber(bArr, jsonReader, scanNumber, currentIndex);
    }

    public static short deserializeShort(JsonReader jsonReader) {
        int parsePositiveInt;
        if (jsonReader.last() == 34) {
            int currentIndex = jsonReader.getCurrentIndex();
            try {
                return parseNumberGeneric(jsonReader.readSimpleQuote(), (jsonReader.getCurrentIndex() - currentIndex) - 1, jsonReader, true).shortValueExact();
            } catch (ArithmeticException unused) {
                throw jsonReader.newParseErrorAt("Short overflow detected", jsonReader.getCurrentIndex() - currentIndex);
            }
        }
        int scanNumber = jsonReader.scanNumber();
        int currentIndex2 = jsonReader.getCurrentIndex();
        byte[] bArr = jsonReader.buffer;
        if (bArr[scanNumber] == 45) {
            parsePositiveInt = parseNegativeInt(bArr, jsonReader, scanNumber, currentIndex2);
        } else {
            parsePositiveInt = parsePositiveInt(bArr, jsonReader, scanNumber, currentIndex2, 0);
        }
        if (parsePositiveInt >= -32768 && parsePositiveInt <= 32767) {
            return (short) parsePositiveInt;
        }
        throw jsonReader.newParseErrorAt("Short overflow detected", jsonReader.getCurrentIndex());
    }

    public static short[] deserializeShortArray(JsonReader jsonReader) {
        if (jsonReader.last() == 93) {
            return SHORT_EMPTY_ARRAY;
        }
        short[] sArr = new short[4];
        sArr[0] = (short) deserializeInt(jsonReader);
        int i6 = 1;
        while (jsonReader.getNextToken() == 44) {
            jsonReader.getNextToken();
            if (i6 == sArr.length) {
                sArr = Arrays.copyOf(sArr, sArr.length << 1);
            }
            sArr[i6] = (short) deserializeInt(jsonReader);
            i6++;
        }
        jsonReader.checkArrayEnd();
        return Arrays.copyOf(sArr, i6);
    }

    public static void deserializeShortCollection(JsonReader jsonReader, Collection<Short> collection) {
        jsonReader.deserializeCollection(SHORT_READER, collection);
    }

    public static ArrayList<Short> deserializeShortNullableCollection(JsonReader jsonReader) {
        return jsonReader.deserializeNullableCollection(SHORT_READER);
    }

    private static double doubleExponent(JsonReader jsonReader, long j10, int i6, double d10, byte[] bArr, int i10, int i11, int i12, int i13) {
        int parsePositiveInt;
        double d11;
        double pow;
        if (jsonReader.doublePrecision == JsonReader.DoublePrecision.EXACT) {
            int i14 = (i11 - i10) - i12;
            return parseDoubleGeneric(jsonReader.prepareBuffer(i10 + i12, i14), i14, jsonReader, false);
        }
        int i15 = i13 + 1;
        byte b10 = bArr[i15];
        if (b10 == 45) {
            parsePositiveInt = parseNegativeInt(bArr, jsonReader, i15, i11);
        } else if (b10 == 43) {
            parsePositiveInt = parsePositiveInt(bArr, jsonReader, i15, i11, 1);
        } else {
            parsePositiveInt = parsePositiveInt(bArr, jsonReader, i15, i11, 0);
        }
        int i16 = parsePositiveInt - i6;
        if (d10 == 0.0d) {
            if (i16 != 0 && j10 != 0) {
                if (i16 > 0) {
                    double[] dArr = POW_10;
                    if (i16 < dArr.length) {
                        return j10 * dArr[i16 - 1];
                    }
                }
                if (i16 < 0) {
                    int i17 = -i16;
                    double[] dArr2 = POW_10;
                    if (i17 < dArr2.length) {
                        return j10 / dArr2[i17 - 1];
                    }
                }
                if (jsonReader.doublePrecision != JsonReader.DoublePrecision.HIGH) {
                    if (i16 > 0 && i16 < 300) {
                        d11 = j10;
                        pow = Math.pow(10.0d, i16);
                        return pow * d11;
                    } else if (i16 > -300 && i16 < 0) {
                        return j10 / Math.pow(10.0d, i16);
                    }
                }
                int i18 = (i11 - i10) - i12;
                return parseDoubleGeneric(jsonReader.prepareBuffer(i10 + i12, i18), i18, jsonReader, false);
            }
            return j10;
        } else if (i16 == 0) {
            return j10 + d10;
        } else {
            if (i16 > 0) {
                double[] dArr3 = POW_10;
                if (i16 < dArr3.length) {
                    double d12 = dArr3[i16 - 1];
                    return (j10 * d12) + (d10 * d12);
                }
            }
            if (i16 < 0) {
                int i19 = -i16;
                double[] dArr4 = POW_10;
                if (i19 < dArr4.length) {
                    double d13 = dArr4[i19 - 1];
                    return (j10 / d13) + (d10 / d13);
                }
            }
            if (jsonReader.doublePrecision != JsonReader.DoublePrecision.HIGH) {
                if (i16 > 0 && i16 < 300) {
                    d11 = j10;
                    pow = Math.pow(10.0d, i16);
                    return pow * d11;
                } else if (i16 > -300 && i16 < 0) {
                    return j10 / Math.pow(10.0d, i16);
                }
            }
            int i182 = (i11 - i10) - i12;
            return parseDoubleGeneric(jsonReader.prepareBuffer(i10 + i12, i182), i182, jsonReader, false);
        }
    }

    private static float floatExponent(JsonReader jsonReader, long j10, int i6, byte[] bArr, int i10, int i11) {
        int parsePositiveInt;
        byte b10 = bArr[i11];
        if (b10 == 45) {
            parsePositiveInt = parseNegativeInt(bArr, jsonReader, i11, i10);
        } else if (b10 == 43) {
            parsePositiveInt = parsePositiveInt(bArr, jsonReader, i11, i10, 1);
        } else {
            parsePositiveInt = parsePositiveInt(bArr, jsonReader, i11, i10, 0);
        }
        int i12 = parsePositiveInt - i6;
        if (i12 != 0 && j10 != 0) {
            if (i12 > 0) {
                double[] dArr = POW_10;
                if (i12 < dArr.length) {
                    return (float) (j10 * dArr[i12 - 1]);
                }
            }
            if (i12 < 0) {
                int i13 = -i12;
                double[] dArr2 = POW_10;
                if (i13 < dArr2.length) {
                    return (float) (j10 / dArr2[i13 - 1]);
                }
            }
            if (i12 > 0) {
                return Float.POSITIVE_INFINITY;
            }
            return 0.0f;
        }
        return (float) j10;
    }

    public static void numberException(JsonReader jsonReader, int i6, int i10, String str) {
        int i11 = i10 - i6;
        if (i11 > jsonReader.maxNumberDigits) {
            throw jsonReader.newParseErrorWith("Too many digits detected in number", i11, "", "Too many digits detected in number", Integer.valueOf(i10), "");
        }
        throw jsonReader.newParseErrorWith("Error parsing number", i11, "", str, null, ". Error parsing number");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        numberException(r26, r27, r28, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static double parseDouble(byte[] bArr, JsonReader jsonReader, int i6, int i10, int i11) {
        boolean z10;
        byte b10;
        byte b11;
        int i12;
        int i13;
        byte b12;
        int i14;
        int i15;
        byte b13;
        int i16 = (i10 - i6) - i11;
        if (i16 > jsonReader.doubleLengthLimit) {
            if (i10 == jsonReader.length()) {
                NumberInfo readLongNumber = readLongNumber(jsonReader, i6 + i11);
                return parseDoubleGeneric(readLongNumber.buffer, readLongNumber.length, jsonReader, false);
            }
            return parseDoubleGeneric(jsonReader.prepareBuffer(i6 + i11, i16), i16, jsonReader, false);
        }
        int i17 = i6 + i11;
        if (bArr[i17] == 48) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i18 = i17;
        long j10 = 0;
        byte b14 = 32;
        while (true) {
            b10 = 69;
            b11 = 101;
            if (i18 >= i10 || (b14 = bArr[i18]) == 46 || b14 == 101 || b14 == 69) {
                break;
            }
            int i19 = b14 - 48;
            if (i19 < 0 || i19 > 9) {
                if (z10 && i18 > i17 + 1) {
                    numberException(jsonReader, i6, i10, "Leading zero is not allowed");
                }
                if (i18 > i17 && jsonReader.allWhitespace(i18, i10)) {
                    return j10;
                }
                numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) b14));
            }
            j10 = (j10 << 3) + (j10 << 1) + i19;
            i18++;
        }
        if (z10 && b14 != 46 && i18 > i17 + 1) {
            numberException(jsonReader, i6, i10, "Leading zero is not allowed");
        } else if (i18 == i10) {
            return j10;
        } else {
            if (b14 == 46) {
                int i20 = i18 + 1;
                if (i20 == i10) {
                    numberException(jsonReader, i6, i10, "Number ends with a dot");
                }
                double d10 = 1.0E14d;
                if (j10 == 0) {
                    i12 = i20 + 15;
                    b14 = bArr[i20];
                    if (b14 == 48 && i10 > i12) {
                        return parseDoubleGeneric(jsonReader.prepareBuffer(i17, i16), i16, jsonReader, false);
                    }
                    if (b14 < 56) {
                        i13 = -1;
                        b12 = b14;
                        i14 = i12;
                        i15 = 1;
                    } else {
                        b12 = b14;
                        d10 = 1.0E15d;
                        i13 = 0;
                        i14 = i12;
                        i15 = 0;
                    }
                } else {
                    i12 = i17 + 16;
                    if (bArr[i17] < 56) {
                        i13 = (i20 - i12) + 14;
                        b12 = b14;
                        i14 = i12;
                        i15 = 1;
                    } else {
                        i13 = (i20 - i12) + 15;
                        b12 = b14;
                        d10 = 1.0E15d;
                        i14 = i12;
                        i15 = 0;
                    }
                }
                if (i14 >= i10) {
                    i14 = i10;
                }
                byte b15 = b12;
                int i21 = i20;
                while (true) {
                    if (i21 < i14) {
                        b13 = bArr[i21];
                        if (b13 == b11 || b13 == b10) {
                            break;
                        }
                        int i22 = b13 - 48;
                        if (i22 < 0 || i22 > 9) {
                            if (jsonReader.allWhitespace(i21, i10)) {
                                return j10 / POW_10[(i21 - i20) - 1];
                            }
                            numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) bArr[i21]));
                        }
                        j10 = (j10 << 3) + (j10 << 1) + i22;
                        i21++;
                        b15 = b13;
                        b11 = 101;
                        b10 = 69;
                    } else {
                        b13 = b15;
                        break;
                    }
                }
                if (i21 == i10) {
                    return j10 / POW_10[(i21 - i20) - 1];
                }
                if (b13 != 101 && b13 != 69) {
                    if (jsonReader.doublePrecision == JsonReader.DoublePrecision.HIGH) {
                        return parseDoubleGeneric(jsonReader.prepareBuffer(i17, i16), i16, jsonReader, false);
                    }
                    int i23 = 0;
                    int i24 = i17 + 18;
                    if (i24 >= i10) {
                        i24 = i10;
                    }
                    int i25 = i21;
                    while (i25 < i24) {
                        b13 = bArr[i25];
                        if (b13 == 101 || b13 == 69) {
                            break;
                        }
                        int i26 = b13 - 48;
                        if (i26 < 0 || i26 > 9) {
                            if (jsonReader.allWhitespace(i25, i10)) {
                                return approximateDouble(i23, j10 / d10, (i25 - i21) - i15);
                            }
                            numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) bArr[i25]));
                        }
                        i23 = (i23 << 3) + (i23 << 1) + i26;
                        i25++;
                    }
                    double approximateDouble = approximateDouble(i23, j10 / d10, (i25 - i21) - i15);
                    int i27 = i25;
                    while (i27 < i10 && b13 >= 48 && b13 <= 57) {
                        b13 = bArr[i27];
                        i27++;
                    }
                    if (b13 != 101 && b13 != 69) {
                        if (i13 > 0) {
                            return approximateDouble * POW_10[i13 - 1];
                        }
                        if (i13 < 0) {
                            return approximateDouble / POW_10[(-i13) - 1];
                        }
                        return approximateDouble;
                    }
                    return doubleExponent(jsonReader, 0L, i13, approximateDouble, bArr, i6, i10, i11, i27);
                }
                return doubleExponent(jsonReader, j10, i21 - i20, 0.0d, bArr, i6, i10, i11, i21);
            } else if (b14 == 101 || b14 == 69) {
                return doubleExponent(jsonReader, j10, 0, 0.0d, bArr, i6, i10, i11, i18);
            }
        }
        return j10;
    }

    private static double parseDoubleGeneric(char[] cArr, int i6, JsonReader jsonReader, boolean z10) {
        int i10;
        int i11;
        char c10;
        int i12 = i6;
        while (i12 > 0 && Character.isWhitespace(cArr[i12 - 1])) {
            i12--;
        }
        if (i12 <= jsonReader.maxNumberDigits) {
            int i13 = 0;
            if (cArr[0] == '-') {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (cArr[i10] == '0' && i12 > (i11 = i10 + 1) && (c10 = cArr[i11]) >= '0' && c10 <= '9') {
                if (z10) {
                    i13 = 2;
                }
                throw jsonReader.newParseErrorAt("Leading zero is not allowed. Error parsing number", i6 + i13);
            }
            try {
                return Double.parseDouble(new String(cArr, 0, i12));
            } catch (NumberFormatException e10) {
                if (z10) {
                    i13 = 2;
                }
                throw jsonReader.newParseErrorAt("Error parsing number", i6 + i13, e10);
            }
        }
        throw jsonReader.newParseErrorWith("Too many digits detected in number", i6, "", "Too many digits detected in number", Integer.valueOf(i12), "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        numberException(r21, r22, r23, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static float parseFloat(byte[] bArr, JsonReader jsonReader, int i6, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17 = i6 + i11;
        if (bArr[i17] == 48) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i18 = i17;
        long j10 = 0;
        byte b10 = 32;
        while (true) {
            i12 = 9;
            if (i18 >= i10 || (b10 = bArr[i18]) == 46 || b10 == 101 || b10 == 69) {
                break;
            }
            int i19 = b10 - 48;
            if (i19 < 0 || i19 > 9) {
                if (z10 && i18 > i17 + 1) {
                    numberException(jsonReader, i6, i10, "Leading zero is not allowed");
                }
                if (i18 > i17 && jsonReader.allWhitespace(i18, i10)) {
                    return (float) j10;
                }
                numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) b10));
            }
            j10 = (j10 << 3) + (j10 << 1) + i19;
            i18++;
        }
        if (z10 && b10 != 46 && i18 > i17 + 1) {
            numberException(jsonReader, i6, i10, "Leading zero is not allowed");
        } else if (i18 > i17 + 18) {
            int i20 = (i10 - i6) - i11;
            return parseFloatGeneric(jsonReader.prepareBuffer(i17, i20), i20, jsonReader, false);
        } else if (i18 == i10) {
            return (float) j10;
        } else {
            if (b10 == 46) {
                int i21 = i18 + 1;
                if (i21 == i10) {
                    numberException(jsonReader, i6, i10, "Number ends with a dot");
                }
                if (j10 == 0) {
                    i14 = i21 + 1;
                    while (i21 < i10 && bArr[i21] == 48) {
                        i21++;
                    }
                    i13 = i21 + 17;
                    i15 = 0;
                } else {
                    i13 = i17 + 17;
                    i14 = i21;
                    i15 = 1;
                }
                if (i13 >= i10) {
                    i13 = i10;
                }
                while (i21 < i13) {
                    b10 = bArr[i21];
                    if (b10 != 101 && b10 != 69) {
                        int i22 = b10 - 48;
                        if (i22 < 0 || i22 > i12) {
                            if (jsonReader.allWhitespace(i21, i10)) {
                                return (float) (j10 / POW_10[(i21 - i14) - i15]);
                            }
                            numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) b10));
                        }
                        j10 = (j10 << 3) + (j10 << 1) + i22;
                        i21++;
                        i12 = 9;
                    } else {
                        i21++;
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                if (i21 == i13 && !z11) {
                    i16 = (i21 + 1) - i15;
                    while (i21 < i10 && b10 >= 48 && b10 <= 57) {
                        b10 = bArr[i21];
                        i21++;
                    }
                } else {
                    i16 = i21 - i15;
                }
                int i23 = i10;
                byte[] bArr2 = bArr;
                while (i21 == i23 && jsonReader.length() == i23) {
                    int scanNumber = jsonReader.scanNumber();
                    i23 = jsonReader.getCurrentIndex();
                    byte[] bArr3 = jsonReader.buffer;
                    while (true) {
                        i21 = scanNumber;
                        if (i21 < i23 && b10 >= 48 && b10 <= 57) {
                            scanNumber = i21 + 1;
                            b10 = bArr3[i21];
                        }
                    }
                    bArr2 = bArr3;
                }
                if (b10 != 101 && b10 != 69) {
                    int i24 = i16 - i14;
                    if (i24 > 0) {
                        return (float) (j10 / POW_10[i24 - 1]);
                    }
                    if (i24 < 0) {
                        return (float) (j10 * POW_10[(-i24) - 1]);
                    }
                    return (float) j10;
                }
                return floatExponent(jsonReader, j10, i16 - i14, bArr2, i23, i21);
            } else if (b10 == 101 || b10 == 69) {
                return floatExponent(jsonReader, j10, 0, bArr, i10, i18 + 1);
            }
        }
        return (float) j10;
    }

    private static float parseFloatGeneric(char[] cArr, int i6, JsonReader jsonReader, boolean z10) {
        int i10;
        int i11;
        char c10;
        int i12 = i6;
        while (i12 > 0 && Character.isWhitespace(cArr[i12 - 1])) {
            i12--;
        }
        if (i12 <= jsonReader.maxNumberDigits) {
            int i13 = 0;
            if (cArr[0] == '-') {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (cArr[i10] == '0' && i12 > (i11 = i10 + 1) && (c10 = cArr[i11]) >= '0' && c10 <= '9') {
                if (z10) {
                    i13 = 2;
                }
                throw jsonReader.newParseErrorAt("Leading zero is not allowed. Error parsing number", i6 + i13);
            }
            try {
                return Float.parseFloat(new String(cArr, 0, i12));
            } catch (NumberFormatException e10) {
                if (z10) {
                    i13 = 2;
                }
                throw jsonReader.newParseErrorAt("Error parsing number", i6 + i13, e10);
            }
        }
        throw jsonReader.newParseErrorWith("Too many digits detected in number", i6, "", "Too many digits detected in number", Integer.valueOf(i12), "");
    }

    private static long parseLongGeneric(JsonReader jsonReader, int i6, int i10) {
        int i11 = i10 - i6;
        char[] prepareBuffer = jsonReader.prepareBuffer(i6, i11);
        if (i11 > 0 && prepareBuffer[i11 - 1] == '.') {
            numberException(jsonReader, i6, i10, "Number ends with a dot");
        }
        BigDecimal parseNumberGeneric = parseNumberGeneric(prepareBuffer, i11, jsonReader, false);
        if (parseNumberGeneric.scale() > 0) {
            numberException(jsonReader, i6, i10, "Expecting long, but found decimal value ", parseNumberGeneric);
        }
        return parseNumberGeneric.longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        numberException(r21, r22, r23, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static BigDecimal parseNegativeDecimal(byte[] bArr, JsonReader jsonReader, int i6, int i10) {
        boolean z10;
        int i11;
        int parsePositiveInt;
        int parsePositiveInt2;
        int i12 = i6 + 1;
        if (bArr[i12] == 48) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        byte b10 = 32;
        int i13 = i12;
        while (true) {
            i11 = 9;
            if (i13 >= i10 || (b10 = bArr[i13]) == 46 || b10 == 101 || b10 == 69) {
                break;
            }
            int i14 = b10 - 48;
            if (i14 < 0 || i14 > 9) {
                if (z10 && i13 > i6 + 2) {
                    numberException(jsonReader, i6, i10, "Leading zero is not allowed");
                }
                if (i13 > i12 && jsonReader.allWhitespace(i13, i10)) {
                    return BigDecimal.valueOf(j10);
                }
                numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) b10));
            }
            j10 = ((j10 << 3) + (j10 << 1)) - i14;
            i13++;
        }
        if (z10 && b10 != 46 && i13 > i6 + 2) {
            numberException(jsonReader, i6, i10, "Leading zero is not allowed");
        } else if (i13 == i10) {
            return BigDecimal.valueOf(j10);
        } else {
            if (b10 == 46) {
                int i15 = i13 + 1;
                if (i15 == i10) {
                    numberException(jsonReader, i6, i10, "Number ends with a dot");
                }
                int i16 = i15;
                while (i16 < i10) {
                    b10 = bArr[i16];
                    if (b10 == 101 || b10 == 69) {
                        break;
                    }
                    int i17 = b10 - 48;
                    if (i17 < 0 || i17 > i11) {
                        if (jsonReader.allWhitespace(i16, i10)) {
                            return BigDecimal.valueOf(j10, i16 - i15);
                        }
                        numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) b10));
                    }
                    j10 = ((j10 << 3) + (j10 << 1)) - i17;
                    i16++;
                    i11 = 9;
                }
                if (i16 == i10) {
                    return BigDecimal.valueOf(j10, i10 - i15);
                }
                if (b10 != 101 && b10 != 69) {
                    return BigDecimal.valueOf(j10, i10 - i15);
                }
                int i18 = i16 + 1;
                byte b11 = bArr[i18];
                if (b11 == 45) {
                    parsePositiveInt2 = parseNegativeInt(bArr, jsonReader, i18, i10);
                } else if (b11 == 43) {
                    parsePositiveInt2 = parsePositiveInt(bArr, jsonReader, i18, i10, 1);
                } else {
                    parsePositiveInt2 = parsePositiveInt(bArr, jsonReader, i18, i10, 0);
                }
                return BigDecimal.valueOf(j10, (i16 - i15) - parsePositiveInt2);
            } else if (b10 == 101 || b10 == 69) {
                int i19 = i13 + 1;
                byte b12 = bArr[i19];
                if (b12 == 45) {
                    parsePositiveInt = parseNegativeInt(bArr, jsonReader, i19, i10);
                } else if (b12 == 43) {
                    parsePositiveInt = parsePositiveInt(bArr, jsonReader, i19, i10, 1);
                } else {
                    parsePositiveInt = parsePositiveInt(bArr, jsonReader, i19, i10, 0);
                }
                return BigDecimal.valueOf(j10, -parsePositiveInt);
            }
        }
        return BigDecimal.valueOf(j10);
    }

    private static int parseNegativeInt(byte[] bArr, JsonReader jsonReader, int i6, int i10) {
        int i11 = i6 + 1;
        if (i11 == i10) {
            numberException(jsonReader, i6, i10, "Digit not found");
        }
        int i12 = 0;
        for (int i13 = i11; i13 < i10; i13++) {
            int i14 = bArr[i13] - 48;
            if (i14 >= 0 && i14 <= 9) {
                i12 = ((i12 << 3) + (i12 << 1)) - i14;
                if (i12 > 0) {
                    numberException(jsonReader, i6, i10, "Integer overflow detected");
                }
            } else if (i13 > i11 && jsonReader.allWhitespace(i13, i10)) {
                return i12;
            } else {
                if (i13 == i10 - 1 && bArr[i13] == 46) {
                    numberException(jsonReader, i6, i10, "Number ends with a dot");
                }
                int i15 = i10 - i6;
                BigDecimal parseNumberGeneric = parseNumberGeneric(jsonReader.prepareBuffer(i6, i15), i15, jsonReader, false);
                if (parseNumberGeneric.scale() > 0) {
                    numberException(jsonReader, i6, i10, "Expecting int but found decimal value", parseNumberGeneric);
                }
                return parseNumberGeneric.intValue();
            }
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
        numberException(r20, r21, r22, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Number parseNegativeNumber(byte[] bArr, JsonReader jsonReader, int i6, int i10) {
        boolean z10;
        int parsePositiveInt;
        int parsePositiveInt2;
        int i11 = i6 + 1;
        if (bArr[i11] == 48) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        byte b10 = 32;
        int i12 = i11;
        while (i12 < i10 && (b10 = bArr[i12]) != 46 && b10 != 101 && b10 != 69) {
            int i13 = b10 - 48;
            if (i13 >= 0 && i13 <= 9) {
                j10 = ((j10 << 3) + (j10 << 1)) - i13;
                i12++;
            } else {
                if (z10 && i12 > i6 + 2) {
                    numberException(jsonReader, i6, i10, "Leading zero is not allowed");
                }
                if (i12 > i11 && jsonReader.allWhitespace(i12, i10)) {
                    return Long.valueOf(j10);
                }
                int i14 = i10 - i6;
                return tryLongFromBigDecimal(jsonReader.prepareBuffer(i6, i14), i14, jsonReader);
            }
        }
        if (z10 && b10 != 46 && i12 > i6 + 2) {
            numberException(jsonReader, i6, i10, "Leading zero is not allowed");
        } else if (i12 == i10) {
            return Long.valueOf(j10);
        } else {
            if (b10 == 46) {
                int i15 = i12 + 1;
                if (i15 == i10) {
                    numberException(jsonReader, i6, i10, "Number ends with a dot");
                }
                int i16 = i15;
                while (i16 < i10) {
                    b10 = bArr[i16];
                    if (b10 == 101 || b10 == 69) {
                        break;
                    }
                    int i17 = b10 - 48;
                    if (i17 >= 0 && i17 <= 9) {
                        j10 = ((j10 << 3) + (j10 << 1)) - i17;
                        i16++;
                    } else if (jsonReader.allWhitespace(i16, i10)) {
                        return BigDecimal.valueOf(j10, i16 - i15);
                    } else {
                        int i18 = i10 - i6;
                        return tryLongFromBigDecimal(jsonReader.prepareBuffer(i6, i18), i18, jsonReader);
                    }
                }
                if (i16 == i10) {
                    return bigDecimalOrDouble(BigDecimal.valueOf(j10, i10 - i15), jsonReader.unknownNumbers);
                }
                if (b10 != 101 && b10 != 69) {
                    return bigDecimalOrDouble(BigDecimal.valueOf(j10, i10 - i15), jsonReader.unknownNumbers);
                }
                int i19 = i16 + 1;
                byte b11 = bArr[i19];
                if (b11 == 45) {
                    parsePositiveInt2 = parseNegativeInt(bArr, jsonReader, i19, i10);
                } else if (b11 == 43) {
                    parsePositiveInt2 = parsePositiveInt(bArr, jsonReader, i19, i10, 1);
                } else {
                    parsePositiveInt2 = parsePositiveInt(bArr, jsonReader, i19, i10, 0);
                }
                return bigDecimalOrDouble(BigDecimal.valueOf(j10, (i16 - i15) - parsePositiveInt2), jsonReader.unknownNumbers);
            } else if (b10 == 101 || b10 == 69) {
                int i20 = i12 + 1;
                byte b12 = bArr[i20];
                if (b12 == 45) {
                    parsePositiveInt = parseNegativeInt(bArr, jsonReader, i20, i10);
                } else if (b12 == 43) {
                    parsePositiveInt = parsePositiveInt(bArr, jsonReader, i20, i10, 1);
                } else {
                    parsePositiveInt = parsePositiveInt(bArr, jsonReader, i20, i10, 0);
                }
                return bigDecimalOrDouble(BigDecimal.valueOf(j10, -parsePositiveInt), jsonReader.unknownNumbers);
            }
        }
        return bigDecimalOrDouble(BigDecimal.valueOf(j10), jsonReader.unknownNumbers);
    }

    private static BigDecimal parseNumberGeneric(char[] cArr, int i6, JsonReader jsonReader, boolean z10) {
        int i10;
        int i11;
        char c10;
        int i12 = i6;
        while (i12 > 0 && Character.isWhitespace(cArr[i12 - 1])) {
            i12--;
        }
        if (i12 <= jsonReader.maxNumberDigits) {
            int i13 = 0;
            if (cArr[0] == '-') {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (cArr[i10] == '0' && i12 > (i11 = i10 + 1) && (c10 = cArr[i11]) >= '0' && c10 <= '9') {
                if (z10) {
                    i13 = 2;
                }
                throw jsonReader.newParseErrorAt("Leading zero is not allowed. Error parsing number", i6 + i13);
            }
            try {
                return new BigDecimal(cArr, 0, i12);
            } catch (NumberFormatException e10) {
                if (z10) {
                    i13 = 2;
                }
                throw jsonReader.newParseErrorAt("Error parsing number", i6 + i13, e10);
            }
        }
        throw jsonReader.newParseErrorWith("Too many digits detected in number", i6, "", "Too many digits detected in number", Integer.valueOf(i12), "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        numberException(r20, r21, r22, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static BigDecimal parsePositiveDecimal(byte[] bArr, JsonReader jsonReader, int i6, int i10) {
        boolean z10;
        int i11;
        int parsePositiveInt;
        int parsePositiveInt2;
        if (bArr[i6] == 48) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        byte b10 = 32;
        int i12 = i6;
        while (true) {
            i11 = 9;
            if (i12 >= i10 || (b10 = bArr[i12]) == 46 || b10 == 101 || b10 == 69) {
                break;
            }
            int i13 = b10 - 48;
            if (i13 < 0 || i13 > 9) {
                if (z10 && i12 > i6 + 1) {
                    numberException(jsonReader, i6, i10, "Leading zero is not allowed");
                }
                if (i12 > i6 && jsonReader.allWhitespace(i12, i10)) {
                    return BigDecimal.valueOf(j10);
                }
                numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) b10));
            }
            j10 = (j10 << 3) + (j10 << 1) + i13;
            i12++;
        }
        if (z10 && b10 != 46 && i12 > i6 + 1) {
            numberException(jsonReader, i6, i10, "Leading zero is not allowed");
        } else if (i12 == i10) {
            return BigDecimal.valueOf(j10);
        } else {
            if (b10 == 46) {
                int i14 = i12 + 1;
                if (i14 == i10) {
                    numberException(jsonReader, i6, i10, "Number ends with a dot");
                }
                int i15 = i14;
                while (i15 < i10) {
                    b10 = bArr[i15];
                    if (b10 == 101 || b10 == 69) {
                        break;
                    }
                    int i16 = b10 - 48;
                    if (i16 < 0 || i16 > i11) {
                        if (jsonReader.allWhitespace(i15, i10)) {
                            return BigDecimal.valueOf(j10, i15 - i14);
                        }
                        numberException(jsonReader, i6, i10, "Unknown digit", Character.valueOf((char) b10));
                    }
                    j10 = (j10 << 3) + (j10 << 1) + i16;
                    i15++;
                    i11 = 9;
                }
                if (i15 == i10) {
                    return BigDecimal.valueOf(j10, i10 - i14);
                }
                if (b10 != 101 && b10 != 69) {
                    return BigDecimal.valueOf(j10, i10 - i14);
                }
                int i17 = i15 + 1;
                byte b11 = bArr[i17];
                if (b11 == 45) {
                    parsePositiveInt2 = parseNegativeInt(bArr, jsonReader, i17, i10);
                } else if (b11 == 43) {
                    parsePositiveInt2 = parsePositiveInt(bArr, jsonReader, i17, i10, 1);
                } else {
                    parsePositiveInt2 = parsePositiveInt(bArr, jsonReader, i17, i10, 0);
                }
                return BigDecimal.valueOf(j10, (i15 - i14) - parsePositiveInt2);
            } else if (b10 == 101 || b10 == 69) {
                int i18 = i12 + 1;
                byte b12 = bArr[i18];
                if (b12 == 45) {
                    parsePositiveInt = parseNegativeInt(bArr, jsonReader, i18, i10);
                } else if (b12 == 43) {
                    parsePositiveInt = parsePositiveInt(bArr, jsonReader, i18, i10, 1);
                } else {
                    parsePositiveInt = parsePositiveInt(bArr, jsonReader, i18, i10, 0);
                }
                return BigDecimal.valueOf(j10, -parsePositiveInt);
            }
        }
        return BigDecimal.valueOf(j10);
    }

    private static int parsePositiveInt(byte[] bArr, JsonReader jsonReader, int i6, int i10, int i11) {
        int i12 = i11 + i6;
        if (i12 == i10) {
            numberException(jsonReader, i6, i10, "Digit not found");
        }
        int i13 = 0;
        for (int i14 = i12; i14 < i10; i14++) {
            int i15 = bArr[i14] - 48;
            if (i15 >= 0 && i15 <= 9) {
                i13 = (i13 << 3) + (i13 << 1) + i15;
                if (i13 < 0) {
                    numberException(jsonReader, i6, i10, "Integer overflow detected");
                }
            } else if (i14 > i12 && jsonReader.allWhitespace(i14, i10)) {
                return i13;
            } else {
                if (i14 == i10 - 1 && bArr[i14] == 46) {
                    numberException(jsonReader, i6, i10, "Number ends with a dot");
                }
                int i16 = i10 - i6;
                BigDecimal parseNumberGeneric = parseNumberGeneric(jsonReader.prepareBuffer(i6, i16), i16, jsonReader, false);
                if (parseNumberGeneric.scale() > 0) {
                    numberException(jsonReader, i6, i10, "Expecting int but found decimal value", parseNumberGeneric);
                }
                return parseNumberGeneric.intValue();
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
        numberException(r19, r20, r21, "Digit not found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Number parsePositiveNumber(byte[] bArr, JsonReader jsonReader, int i6, int i10) {
        boolean z10;
        int parsePositiveInt;
        int parsePositiveInt2;
        if (bArr[i6] == 48) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = 0;
        byte b10 = 32;
        int i11 = i6;
        while (i11 < i10 && (b10 = bArr[i11]) != 46 && b10 != 101 && b10 != 69) {
            int i12 = b10 - 48;
            if (i12 >= 0 && i12 <= 9) {
                j10 = i12 + (j10 << 3) + (j10 << 1);
                i11++;
            } else {
                if (z10 && i11 > i6 + 1) {
                    numberException(jsonReader, i6, i10, "Leading zero is not allowed");
                }
                if (i11 > i6 && jsonReader.allWhitespace(i11, i10)) {
                    return Long.valueOf(j10);
                }
                int i13 = i10 - i6;
                return tryLongFromBigDecimal(jsonReader.prepareBuffer(i6, i13), i13, jsonReader);
            }
        }
        if (z10 && b10 != 46 && i11 > i6 + 1) {
            numberException(jsonReader, i6, i10, "Leading zero is not allowed");
        } else if (i11 == i10) {
            return Long.valueOf(j10);
        } else {
            if (b10 == 46) {
                int i14 = i11 + 1;
                if (i14 == i10) {
                    numberException(jsonReader, i6, i10, "Number ends with a dot");
                }
                int i15 = i14;
                while (i15 < i10) {
                    b10 = bArr[i15];
                    if (b10 == 101 || b10 == 69) {
                        break;
                    }
                    int i16 = b10 - 48;
                    if (i16 >= 0 && i16 <= 9) {
                        j10 = (j10 << 3) + (j10 << 1) + i16;
                        i15++;
                    } else if (jsonReader.allWhitespace(i15, i10)) {
                        return BigDecimal.valueOf(j10, i15 - i14);
                    } else {
                        int i17 = i10 - i6;
                        return tryLongFromBigDecimal(jsonReader.prepareBuffer(i6, i17), i17, jsonReader);
                    }
                }
                if (i15 == i10) {
                    return bigDecimalOrDouble(BigDecimal.valueOf(j10, i10 - i14), jsonReader.unknownNumbers);
                }
                if (b10 != 101 && b10 != 69) {
                    return BigDecimal.valueOf(j10, i10 - i14);
                }
                int i18 = i15 + 1;
                byte b11 = bArr[i18];
                if (b11 == 45) {
                    parsePositiveInt2 = parseNegativeInt(bArr, jsonReader, i18, i10);
                } else if (b11 == 43) {
                    parsePositiveInt2 = parsePositiveInt(bArr, jsonReader, i18, i10, 1);
                } else {
                    parsePositiveInt2 = parsePositiveInt(bArr, jsonReader, i18, i10, 0);
                }
                return bigDecimalOrDouble(BigDecimal.valueOf(j10, (i15 - i14) - parsePositiveInt2), jsonReader.unknownNumbers);
            } else if (b10 == 101 || b10 == 69) {
                int i19 = i11 + 1;
                byte b12 = bArr[i19];
                if (b12 == 45) {
                    parsePositiveInt = parseNegativeInt(bArr, jsonReader, i19, i10);
                } else if (b12 == 43) {
                    parsePositiveInt = parsePositiveInt(bArr, jsonReader, i19, i10, 1);
                } else {
                    parsePositiveInt = parsePositiveInt(bArr, jsonReader, i19, i10, 0);
                }
                return bigDecimalOrDouble(BigDecimal.valueOf(j10, -parsePositiveInt), jsonReader.unknownNumbers);
            }
        }
        return bigDecimalOrDouble(BigDecimal.valueOf(j10), jsonReader.unknownNumbers);
    }

    public static int read2(char[] cArr, int i6) {
        int i10 = cArr[i6] - '0';
        return (((i10 << 3) + (i10 << 1)) + cArr[i6 + 1]) - 48;
    }

    public static int read4(char[] cArr, int i6) {
        int i10 = cArr[i6 + 1] - '0';
        int i11 = cArr[i6 + 2] - '0';
        return ((((((((cArr[i6] - '0') * 1000) + (i10 << 6)) + (i10 << 5)) + (i10 << 2)) + (i11 << 3)) + (i11 << 1)) + cArr[i6 + 3]) - 48;
    }

    private static NumberInfo readLongNumber(JsonReader jsonReader, int i6) {
        int length = jsonReader.length() - i6;
        char[] prepareBuffer = jsonReader.prepareBuffer(i6, length);
        while (jsonReader.length() == jsonReader.getCurrentIndex() && !jsonReader.isEndOfStream()) {
            jsonReader.scanNumber();
            int currentIndex = jsonReader.getCurrentIndex();
            int i10 = length + currentIndex;
            int i11 = jsonReader.maxNumberDigits;
            if (i10 <= i11) {
                char[] cArr = new char[i10];
                System.arraycopy(prepareBuffer, 0, cArr, 0, length);
                System.arraycopy(jsonReader.prepareBuffer(0, currentIndex), 0, cArr, length, currentIndex);
                length = i10;
                prepareBuffer = cArr;
            } else {
                throw jsonReader.newParseErrorFormat("Too many digits detected in number", i10, "Number of digits larger than %d. Unable to read number", Integer.valueOf(i11));
            }
        }
        return new NumberInfo(prepareBuffer, length);
    }

    public static void serialize(double d10, JsonWriter jsonWriter) {
        jsonWriter.writeDouble(d10);
    }

    public static void serializeNullable(Double d10, JsonWriter jsonWriter) {
        if (d10 == null) {
            jsonWriter.writeNull();
        } else {
            serialize(d10.doubleValue(), jsonWriter);
        }
    }

    private static Number tryLongFromBigDecimal(char[] cArr, int i6, JsonReader jsonReader) {
        BigDecimal parseNumberGeneric = parseNumberGeneric(cArr, i6, jsonReader, false);
        if (parseNumberGeneric.scale() == 0 && parseNumberGeneric.precision() <= 19) {
            if (parseNumberGeneric.signum() == 1) {
                if (parseNumberGeneric.compareTo(BD_MAX_LONG) <= 0) {
                    return Long.valueOf(parseNumberGeneric.longValue());
                }
            } else if (parseNumberGeneric.compareTo(BD_MIN_LONG) >= 0) {
                return Long.valueOf(parseNumberGeneric.longValue());
            }
        }
        return bigDecimalOrDouble(parseNumberGeneric, jsonReader.unknownNumbers);
    }

    public static void write2(int i6, byte[] bArr, int i10) {
        int i11 = DIGITS[i6];
        bArr[i10] = (byte) (i11 >> 8);
        bArr[i10 + 1] = (byte) i11;
    }

    public static void write3(int i6, byte[] bArr, int i10) {
        int i11 = DIGITS[i6];
        bArr[i10] = (byte) (i11 >> 16);
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) i11;
    }

    public static void write4(int i6, byte[] bArr, int i10) {
        if (i6 <= 9999) {
            int i11 = i6 / 1000;
            int i12 = DIGITS[i6 - (i11 * 1000)];
            bArr[i10] = (byte) (i11 + 48);
            bArr[i10 + 1] = (byte) (i12 >> 16);
            bArr[i10 + 2] = (byte) (i12 >> 8);
            bArr[i10 + 3] = (byte) i12;
            return;
        }
        throw new IllegalArgumentException(c.p("Only 4 digits numbers are supported. Provided: ", i6));
    }

    private static void writeBuf(byte[] bArr, int i6, int i10) {
        bArr[i10] = (byte) (i6 >> 16);
        bArr[i10 + 1] = (byte) (i6 >> 8);
        bArr[i10 + 2] = (byte) i6;
    }

    private static int writeFirstBuf(byte[] bArr, int i6, int i10) {
        int i11 = i6 >> 24;
        if (i11 == 0) {
            int i12 = i10 + 1;
            bArr[i10] = (byte) (i6 >> 16);
            i10 = i12 + 1;
            bArr[i12] = (byte) (i6 >> 8);
        } else if (i11 == 1) {
            bArr[i10] = (byte) (i6 >> 8);
            i10++;
        }
        bArr[i10] = (byte) i6;
        return 3 - i11;
    }

    public static void deserializeDecimalCollection(JsonReader jsonReader, Collection<BigDecimal> collection) {
        jsonReader.deserializeCollection(DecimalReader, collection);
    }

    public static void deserializeDecimalNullableCollection(JsonReader jsonReader, Collection<BigDecimal> collection) {
        jsonReader.deserializeNullableCollection(DecimalReader, collection);
    }

    public static void deserializeDoubleCollection(JsonReader jsonReader, Collection<Double> collection) {
        jsonReader.deserializeCollection(DOUBLE_READER, collection);
    }

    public static void deserializeDoubleNullableCollection(JsonReader jsonReader, Collection<Double> collection) {
        jsonReader.deserializeNullableCollection(DOUBLE_READER, collection);
    }

    public static void deserializeFloatCollection(JsonReader jsonReader, Collection<Float> collection) {
        jsonReader.deserializeCollection(FLOAT_READER, collection);
    }

    public static void deserializeFloatNullableCollection(JsonReader jsonReader, Collection<Float> collection) {
        jsonReader.deserializeNullableCollection(FLOAT_READER, collection);
    }

    public static void deserializeIntCollection(JsonReader jsonReader, Collection<Integer> collection) {
        jsonReader.deserializeCollection(INT_READER, collection);
    }

    public static void deserializeIntNullableCollection(JsonReader jsonReader, Collection<Integer> collection) {
        jsonReader.deserializeNullableCollection(INT_READER, collection);
    }

    public static void deserializeLongCollection(JsonReader jsonReader, Collection<Long> collection) {
        jsonReader.deserializeCollection(LONG_READER, collection);
    }

    public static void deserializeLongNullableCollection(JsonReader jsonReader, Collection<Long> collection) {
        jsonReader.deserializeNullableCollection(LONG_READER, collection);
    }

    public static void deserializeShortNullableCollection(JsonReader jsonReader, Collection<Short> collection) {
        jsonReader.deserializeNullableCollection(SHORT_READER, collection);
    }

    public static void serialize(double[] dArr, JsonWriter jsonWriter) {
        if (dArr == null) {
            jsonWriter.writeNull();
        } else if (dArr.length == 0) {
            jsonWriter.writeAscii("[]");
        } else {
            jsonWriter.writeByte(JsonWriter.ARRAY_START);
            serialize(dArr[0], jsonWriter);
            for (int i6 = 1; i6 < dArr.length; i6++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                serialize(dArr[i6], jsonWriter);
            }
            jsonWriter.writeByte(JsonWriter.ARRAY_END);
        }
    }

    public static void serializeNullable(Float f, JsonWriter jsonWriter) {
        if (f == null) {
            jsonWriter.writeNull();
        } else {
            serialize(f.floatValue(), jsonWriter);
        }
    }

    public static void numberException(JsonReader jsonReader, int i6, int i10, String str, Object obj) {
        int i11 = i10 - i6;
        if (i11 > jsonReader.maxNumberDigits) {
            throw jsonReader.newParseErrorWith("Too many digits detected in number", i11, "", "Too many digits detected in number", Integer.valueOf(i10), "");
        }
        throw jsonReader.newParseErrorWith("Error parsing number", i11, "", str, obj, ". Error parsing number");
    }

    public static void serializeNullable(Integer num, JsonWriter jsonWriter) {
        if (num == null) {
            jsonWriter.writeNull();
        } else {
            serialize(num.intValue(), jsonWriter);
        }
    }

    public static void serializeNullable(Long l2, JsonWriter jsonWriter) {
        if (l2 == null) {
            jsonWriter.writeNull();
        } else {
            serialize(l2.longValue(), jsonWriter);
        }
    }

    public static void serializeNullable(BigDecimal bigDecimal, JsonWriter jsonWriter) {
        if (bigDecimal == null) {
            jsonWriter.writeNull();
        } else {
            jsonWriter.writeAscii(bigDecimal.toString());
        }
    }

    public static void serialize(float f, JsonWriter jsonWriter) {
        if (f == Float.POSITIVE_INFINITY) {
            jsonWriter.writeAscii("\"Infinity\"");
        } else if (f == Float.NEGATIVE_INFINITY) {
            jsonWriter.writeAscii("\"-Infinity\"");
        } else if (f != f) {
            jsonWriter.writeAscii("\"NaN\"");
        } else {
            jsonWriter.writeAscii(Float.toString(f));
        }
    }

    public static void serialize(float[] fArr, JsonWriter jsonWriter) {
        if (fArr == null) {
            jsonWriter.writeNull();
        } else if (fArr.length == 0) {
            jsonWriter.writeAscii("[]");
        } else {
            jsonWriter.writeByte(JsonWriter.ARRAY_START);
            serialize(fArr[0], jsonWriter);
            for (int i6 = 1; i6 < fArr.length; i6++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                serialize(fArr[i6], jsonWriter);
            }
            jsonWriter.writeByte(JsonWriter.ARRAY_END);
        }
    }

    public static void serialize(int i6, JsonWriter jsonWriter) {
        byte[] ensureCapacity = jsonWriter.ensureCapacity(11);
        int size = jsonWriter.size();
        jsonWriter.advance(serialize(ensureCapacity, size, i6) - size);
    }

    private static int serialize(byte[] bArr, int i6, int i10) {
        int i11;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                int i12 = 0;
                while (true) {
                    byte[] bArr2 = MIN_INT;
                    if (i12 < bArr2.length) {
                        bArr[i6 + i12] = bArr2[i12];
                        i12++;
                    } else {
                        return i6 + bArr2.length;
                    }
                }
            } else {
                i10 = -i10;
                bArr[i6] = MINUS;
                i6++;
            }
        }
        int i13 = i10 / 1000;
        if (i13 == 0) {
            return i6 + writeFirstBuf(bArr, DIGITS[i10], i6);
        }
        int i14 = i10 - (i13 * 1000);
        int i15 = i13 / 1000;
        if (i15 == 0) {
            int[] iArr = DIGITS;
            int i16 = iArr[i14];
            int writeFirstBuf = writeFirstBuf(bArr, iArr[i13], i6);
            writeBuf(bArr, i16, i6 + writeFirstBuf);
            return i6 + 3 + writeFirstBuf;
        }
        int i17 = i15 / 1000;
        int[] iArr2 = DIGITS;
        int i18 = iArr2[i14];
        int i19 = iArr2[i13 - (i15 * 1000)];
        if (i17 == 0) {
            i11 = i6 + writeFirstBuf(bArr, iArr2[i15], i6);
        } else {
            int i20 = i6 + 1;
            bArr[i6] = (byte) (i17 + 48);
            writeBuf(bArr, iArr2[i15 - (i17 * 1000)], i20);
            i11 = i20 + 3;
        }
        writeBuf(bArr, i19, i11);
        writeBuf(bArr, i18, i11 + 3);
        return i11 + 6;
    }

    public static void serialize(int[] iArr, JsonWriter jsonWriter) {
        if (iArr == null) {
            jsonWriter.writeNull();
        } else if (iArr.length == 0) {
            jsonWriter.writeAscii("[]");
        } else {
            byte[] ensureCapacity = jsonWriter.ensureCapacity((iArr.length * 11) + 2);
            int size = jsonWriter.size();
            ensureCapacity[size] = JsonWriter.ARRAY_START;
            int serialize = serialize(ensureCapacity, size + 1, iArr[0]);
            for (int i6 = 1; i6 < iArr.length; i6++) {
                ensureCapacity[serialize] = JsonWriter.COMMA;
                serialize = serialize(ensureCapacity, serialize + 1, iArr[i6]);
            }
            ensureCapacity[serialize] = JsonWriter.ARRAY_END;
            jsonWriter.advance((serialize + 1) - jsonWriter.size());
        }
    }

    public static void serialize(short[] sArr, JsonWriter jsonWriter) {
        if (sArr == null) {
            jsonWriter.writeNull();
        } else if (sArr.length == 0) {
            jsonWriter.writeAscii("[]");
        } else {
            jsonWriter.writeByte(JsonWriter.ARRAY_START);
            serialize((int) sArr[0], jsonWriter);
            for (int i6 = 1; i6 < sArr.length; i6++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                serialize((int) sArr[i6], jsonWriter);
            }
            jsonWriter.writeByte(JsonWriter.ARRAY_END);
        }
    }

    public static void serialize(long j10, JsonWriter jsonWriter) {
        byte[] ensureCapacity = jsonWriter.ensureCapacity(21);
        int size = jsonWriter.size();
        jsonWriter.advance(serialize(ensureCapacity, size, j10) - size);
    }

    private static int serialize(byte[] bArr, int i6, long j10) {
        int i10;
        if (j10 < 0) {
            if (j10 == Long.MIN_VALUE) {
                int i11 = 0;
                while (true) {
                    byte[] bArr2 = MIN_LONG;
                    if (i11 < bArr2.length) {
                        bArr[i6 + i11] = bArr2[i11];
                        i11++;
                    } else {
                        return i6 + bArr2.length;
                    }
                }
            } else {
                j10 = -j10;
                bArr[i6] = MINUS;
                i6++;
            }
        }
        long j11 = j10 / 1000;
        if (j11 == 0) {
            return i6 + writeFirstBuf(bArr, DIGITS[(int) j10], i6);
        }
        Long.signum(j11);
        int i12 = (int) (j10 - (j11 * 1000));
        long j12 = j11 / 1000;
        if (j12 == 0) {
            int[] iArr = DIGITS;
            int i13 = iArr[i12];
            int writeFirstBuf = writeFirstBuf(bArr, iArr[(int) j11], i6);
            writeBuf(bArr, i13, i6 + writeFirstBuf);
            return i6 + 3 + writeFirstBuf;
        }
        int i14 = (int) (j11 - (j12 * 1000));
        long j13 = j12 / 1000;
        if (j13 == 0) {
            int[] iArr2 = DIGITS;
            int i15 = iArr2[i12];
            int i16 = iArr2[i14];
            int writeFirstBuf2 = i6 + writeFirstBuf(bArr, iArr2[(int) j12], i6);
            writeBuf(bArr, i16, writeFirstBuf2);
            writeBuf(bArr, i15, writeFirstBuf2 + 3);
            return writeFirstBuf2 + 6;
        }
        int i17 = (int) (j12 - (j13 * 1000));
        int i18 = (int) (j13 / 1000);
        if (i18 == 0) {
            int[] iArr3 = DIGITS;
            int i19 = iArr3[i12];
            int i20 = iArr3[i14];
            int i21 = iArr3[i17];
            int writeFirstBuf3 = i6 + writeFirstBuf(bArr, iArr3[(int) j13], i6);
            writeBuf(bArr, i21, writeFirstBuf3);
            writeBuf(bArr, i20, writeFirstBuf3 + 3);
            writeBuf(bArr, i19, writeFirstBuf3 + 6);
            return writeFirstBuf3 + 9;
        }
        int i22 = (int) (j13 - (i18 * 1000));
        int i23 = i18 / 1000;
        if (i23 == 0) {
            int[] iArr4 = DIGITS;
            int i24 = iArr4[i12];
            int i25 = iArr4[i14];
            int i26 = iArr4[i17];
            int i27 = iArr4[i22];
            int writeFirstBuf4 = i6 + writeFirstBuf(bArr, iArr4[i18], i6);
            writeBuf(bArr, i27, writeFirstBuf4);
            writeBuf(bArr, i26, writeFirstBuf4 + 3);
            writeBuf(bArr, i25, writeFirstBuf4 + 6);
            writeBuf(bArr, i24, writeFirstBuf4 + 9);
            return writeFirstBuf4 + 12;
        }
        int i28 = i23 / 1000;
        int[] iArr5 = DIGITS;
        int i29 = iArr5[i12];
        int i30 = iArr5[i14];
        int i31 = iArr5[i17];
        int i32 = iArr5[i22];
        int i33 = iArr5[i18 - (i23 * 1000)];
        if (i28 == 0) {
            i10 = i6 + writeFirstBuf(bArr, iArr5[i23], i6);
        } else {
            int i34 = i6 + 1;
            bArr[i6] = (byte) (i28 + 48);
            writeBuf(bArr, iArr5[i23 - (i28 * 1000)], i34);
            i10 = i34 + 3;
        }
        writeBuf(bArr, i33, i10);
        writeBuf(bArr, i32, i10 + 3);
        writeBuf(bArr, i31, i10 + 6);
        writeBuf(bArr, i30, i10 + 9);
        writeBuf(bArr, i29, i10 + 12);
        return i10 + 15;
    }

    public static void serialize(long[] jArr, JsonWriter jsonWriter) {
        if (jArr == null) {
            jsonWriter.writeNull();
        } else if (jArr.length == 0) {
            jsonWriter.writeAscii("[]");
        } else {
            byte[] ensureCapacity = jsonWriter.ensureCapacity((jArr.length * 21) + 2);
            int size = jsonWriter.size();
            ensureCapacity[size] = JsonWriter.ARRAY_START;
            int serialize = serialize(ensureCapacity, size + 1, jArr[0]);
            for (int i6 = 1; i6 < jArr.length; i6++) {
                ensureCapacity[serialize] = JsonWriter.COMMA;
                serialize = serialize(ensureCapacity, serialize + 1, jArr[i6]);
            }
            ensureCapacity[serialize] = JsonWriter.ARRAY_END;
            jsonWriter.advance((serialize + 1) - jsonWriter.size());
        }
    }

    public static void serialize(BigDecimal bigDecimal, JsonWriter jsonWriter) {
        jsonWriter.writeAscii(bigDecimal.toString());
    }
}
