package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes2.dex */
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        O zac(I i);

        I zad(O o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <O, I> I zaD(Field<I, O> field, Object obj) {
        return ((Field) field).zak != null ? field.zaf(obj) : obj;
    }

    private final <I, O> void zaE(Field<I, O> field, I i) {
        String str = field.zae;
        O zae = field.zae(i);
        int i2 = field.zac;
        switch (i2) {
            case 0:
                if (zae != null) {
                    setIntegerInternal(field, str, ((Integer) zae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (BigInteger) zae);
                return;
            case 2:
                if (zae != null) {
                    setLongInternal(field, str, ((Long) zae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            case 4:
                if (zae != null) {
                    zan(field, str, ((Double) zae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (BigDecimal) zae);
                return;
            case 6:
                if (zae != null) {
                    setBooleanInternal(field, str, ((Boolean) zae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) zae);
                return;
            case 8:
            case 9:
                if (zae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) zae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        int i = field.zaa;
        if (i == 11) {
            Class<? extends FastJsonResponse> cls = field.zag;
            Preconditions.checkNotNull(cls);
            sb.append(cls.cast(obj).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    private static final <O> void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(Field field, String str, T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, Field<?, ?>> getFieldMappings();

    protected abstract Object getValueObject(String str);

    protected abstract boolean isPrimitiveFieldSet(String str);

    protected void setBooleanInternal(Field<?, ?> field, String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(Field<?, ?> field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(Field<?, ?> field, String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(Field<?, ?> field, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(Field<?, ?> field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(Field<?, ?> field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object zaD = zaD(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (zaD == null) {
                    sb.append(AbstractJsonLexerKt.NULL);
                } else {
                    switch (field.zac) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) zaD));
                            sb.append("\"");
                            continue;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) zaD));
                            sb.append("\"");
                            continue;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) zaD);
                            continue;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                zaF(sb, field, zaD);
                                continue;
                            }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final <O> void zaA(Field<String, O> field, String str) {
        if (((Field) field).zak == null) {
            setStringInternal(field, field.zae, str);
        } else {
            zaE(field, str);
        }
    }

    public final <O> void zaB(Field<Map<String, String>, O> field, Map<String, String> map) {
        if (((Field) field).zak == null) {
            setStringMapInternal(field, field.zae, map);
        } else {
            zaE(field, map);
        }
    }

    public final <O> void zaC(Field<ArrayList<String>, O> field, ArrayList<String> arrayList) {
        if (((Field) field).zak == null) {
            setStringsInternal(field, field.zae, arrayList);
        } else {
            zaE(field, arrayList);
        }
    }

    public final <O> void zaa(Field<BigDecimal, O> field, BigDecimal bigDecimal) {
        if (((Field) field).zak == null) {
            zab(field, field.zae, bigDecimal);
        } else {
            zaE(field, bigDecimal);
        }
    }

    protected void zab(Field<?, ?> field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final <O> void zac(Field<ArrayList<BigDecimal>, O> field, ArrayList<BigDecimal> arrayList) {
        if (((Field) field).zak == null) {
            zad(field, field.zae, arrayList);
        } else {
            zaE(field, arrayList);
        }
    }

    protected void zad(Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final <O> void zae(Field<BigInteger, O> field, BigInteger bigInteger) {
        if (((Field) field).zak == null) {
            zaf(field, field.zae, bigInteger);
        } else {
            zaE(field, bigInteger);
        }
    }

    protected void zaf(Field<?, ?> field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final <O> void zag(Field<ArrayList<BigInteger>, O> field, ArrayList<BigInteger> arrayList) {
        if (((Field) field).zak == null) {
            zah(field, field.zae, arrayList);
        } else {
            zaE(field, arrayList);
        }
    }

    protected void zah(Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final <O> void zai(Field<Boolean, O> field, boolean z) {
        if (((Field) field).zak == null) {
            setBooleanInternal(field, field.zae, z);
        } else {
            zaE(field, Boolean.valueOf(z));
        }
    }

    public final <O> void zaj(Field<ArrayList<Boolean>, O> field, ArrayList<Boolean> arrayList) {
        if (((Field) field).zak == null) {
            zak(field, field.zae, arrayList);
        } else {
            zaE(field, arrayList);
        }
    }

    protected void zak(Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final <O> void zal(Field<byte[], O> field, byte[] bArr) {
        if (((Field) field).zak == null) {
            setDecodedBytesInternal(field, field.zae, bArr);
        } else {
            zaE(field, bArr);
        }
    }

    public final <O> void zam(Field<Double, O> field, double d) {
        if (((Field) field).zak == null) {
            zan(field, field.zae, d);
        } else {
            zaE(field, Double.valueOf(d));
        }
    }

    protected void zan(Field<?, ?> field, String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final <O> void zao(Field<ArrayList<Double>, O> field, ArrayList<Double> arrayList) {
        if (((Field) field).zak == null) {
            zap(field, field.zae, arrayList);
        } else {
            zaE(field, arrayList);
        }
    }

    protected void zap(Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final <O> void zaq(Field<Float, O> field, float f) {
        if (((Field) field).zak == null) {
            zar(field, field.zae, f);
        } else {
            zaE(field, Float.valueOf(f));
        }
    }

    protected void zar(Field<?, ?> field, String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final <O> void zas(Field<ArrayList<Float>, O> field, ArrayList<Float> arrayList) {
        if (((Field) field).zak == null) {
            zat(field, field.zae, arrayList);
        } else {
            zaE(field, arrayList);
        }
    }

    protected void zat(Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final <O> void zau(Field<Integer, O> field, int i) {
        if (((Field) field).zak == null) {
            setIntegerInternal(field, field.zae, i);
        } else {
            zaE(field, Integer.valueOf(i));
        }
    }

    public final <O> void zav(Field<ArrayList<Integer>, O> field, ArrayList<Integer> arrayList) {
        if (((Field) field).zak == null) {
            zaw(field, field.zae, arrayList);
        } else {
            zaE(field, arrayList);
        }
    }

    protected void zaw(Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final <O> void zax(Field<Long, O> field, long j) {
        if (((Field) field).zak == null) {
            setLongInternal(field, field.zae, j);
        } else {
            zaE(field, Long.valueOf(j));
        }
    }

    public final <O> void zay(Field<ArrayList<Long>, O> field, ArrayList<Long> arrayList) {
        if (((Field) field).zak == null) {
            zaz(field, field.zae, arrayList);
        } else {
            zaE(field, arrayList);
        }
    }

    protected void zaz(Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* loaded from: classes2.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        protected final int zaa;
        protected final boolean zab;
        protected final int zac;
        protected final boolean zad;
        protected final String zae;
        protected final int zaf;
        protected final Class<? extends FastJsonResponse> zag;
        protected final String zah;
        private final int zai;
        private zan zaj;
        private FieldConverter<I, O> zak;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = (FieldConverter<I, O>) zaaVar.zab();
            }
        }

        public static Field<byte[], byte[]> forBase64(String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        public static Field<Boolean, Boolean> forBoolean(String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, int i, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, int i, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        public static Field<Double, Double> forDouble(String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        public static Field<Float, Float> forFloat(String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        public static Field<Integer, Integer> forInteger(String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        public static Field<Long, Long> forLong(String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        public static Field<String, String> forString(String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String str, int i) {
            return new Field<>(10, false, 10, false, str, i, null, null);
        }

        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        public static Field withConverter(String str, int i, FieldConverter<?, ?> fieldConverter, boolean z) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z, 0, false, str, i, null, fieldConverter);
        }

        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        public final String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
            Class<? extends FastJsonResponse> cls = this.zag;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.zak;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zai);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zag(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        final com.google.android.gms.common.server.converter.zaa zaa() {
            FieldConverter<I, O> fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        public final Field<I, O> zab() {
            return new Field<>(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        public final FastJsonResponse zad() throws InstantiationException, IllegalAccessException {
            Preconditions.checkNotNull(this.zag);
            Class<? extends FastJsonResponse> cls = this.zag;
            if (cls == SafeParcelResponse.class) {
                Preconditions.checkNotNull(this.zah);
                Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new SafeParcelResponse(this.zaj, this.zah);
            }
            return cls.newInstance();
        }

        public final O zae(I i) {
            Preconditions.checkNotNull(this.zak);
            return (O) Preconditions.checkNotNull(this.zak.zac(i));
        }

        public final I zaf(O o) {
            Preconditions.checkNotNull(this.zak);
            return this.zak.zad(o);
        }

        final String zag() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map<String, Field<?, ?>> zah() {
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj);
            return (Map) Preconditions.checkNotNull(this.zaj.zab(this.zah));
        }

        public final void zai(zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        protected Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, FieldConverter<I, O> fieldConverter) {
            this.zai = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object getFieldValue(Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
        boolean z = field.zad;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isFieldSet(Field field) {
        if (field.zac == 11) {
            boolean z = field.zad;
            String str = field.zae;
            if (z) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return isPrimitiveFieldSet(field.zae);
    }
}
