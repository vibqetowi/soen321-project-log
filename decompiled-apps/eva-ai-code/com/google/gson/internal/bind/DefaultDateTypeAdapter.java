package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List<DateFormat> dateFormats;
    private final DateType<T> dateType;

    /* loaded from: classes7.dex */
    public static abstract class DateType<T extends Date> {
        public static final DateType<Date> DATE = new DateType<Date>(Date.class) { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.1
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
            protected Date deserialize(Date date) {
                return date;
            }
        };
        private final Class<T> dateClass;

        protected abstract T deserialize(Date date);

        /* JADX INFO: Access modifiers changed from: protected */
        public DateType(Class<T> cls) {
            this.dateClass = cls;
        }

        private TypeAdapterFactory createFactory(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.newFactory(this.dateClass, defaultDateTypeAdapter);
        }

        public final TypeAdapterFactory createAdapterFactory(String str) {
            return createFactory(new DefaultDateTypeAdapter<>(this, str));
        }

        public final TypeAdapterFactory createAdapterFactory(int i) {
            return createFactory(new DefaultDateTypeAdapter<>(this, i));
        }

        public final TypeAdapterFactory createAdapterFactory(int i, int i2) {
            return createFactory(new DefaultDateTypeAdapter<>(this, i, i2));
        }

        public final TypeAdapterFactory createDefaultsAdapterFactory() {
            return createFactory(new DefaultDateTypeAdapter<>(this, 2, 2));
        }
    }

    private DefaultDateTypeAdapter(DateType<T> dateType, String str) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (DateType) Objects.requireNonNull(dateType);
        arrayList.add(new SimpleDateFormat(str, Locale.US));
        if (Locale.getDefault().equals(Locale.US)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(DateType<T> dateType, int i) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (DateType) Objects.requireNonNull(dateType);
        arrayList.add(DateFormat.getDateInstance(i, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateInstance(i));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateFormat(i));
        }
    }

    private DefaultDateTypeAdapter(DateType<T> dateType, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        this.dateType = (DateType) Objects.requireNonNull(dateType);
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(i, i2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = this.dateFormats.get(0);
        synchronized (this.dateFormats) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.dateType.deserialize(deserializeToDate(jsonReader));
    }

    private Date deserializeToDate(JsonReader jsonReader) throws IOException {
        String nextString = jsonReader.nextString();
        synchronized (this.dateFormats) {
            for (DateFormat dateFormat : this.dateFormats) {
                try {
                    return dateFormat.parse(nextString);
                } catch (ParseException unused) {
                }
            }
            try {
                return ISO8601Utils.parse(nextString, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException("Failed parsing '" + nextString + "' as Date; at path " + jsonReader.getPreviousPath(), e);
            }
        }
    }

    public String toString() {
        DateFormat dateFormat = this.dateFormats.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
