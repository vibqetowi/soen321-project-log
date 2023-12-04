package com.ifriend.domain.config;

import com.facebook.internal.ServerProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PrimitiveValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toPrimitiveValue", "Lcom/ifriend/domain/config/PrimitiveValue;", "", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimitiveValueKt {
    private static final PrimitiveValue toPrimitiveValue$toPrimitiveValue(String str) {
        try {
            return new LongPrimitiveValue(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            if (StringsKt.equals(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, true)) {
                return new BooleanPrimitiveValue(true);
            }
            if (StringsKt.equals(str, "false", true)) {
                return new BooleanPrimitiveValue(false);
            }
            return new StringPrimitiveValue(StringsKt.trim(str, '\"'));
        }
    }

    public static final PrimitiveValue toPrimitiveValue(Object obj) {
        BooleanPrimitiveValue booleanPrimitiveValue;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        try {
            if (obj instanceof Double) {
                booleanPrimitiveValue = new LongPrimitiveValue((long) ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                booleanPrimitiveValue = new LongPrimitiveValue(((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                booleanPrimitiveValue = new LongPrimitiveValue(((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                booleanPrimitiveValue = new LongPrimitiveValue(((Number) obj).intValue());
            } else {
                booleanPrimitiveValue = obj instanceof Boolean ? new BooleanPrimitiveValue(((Boolean) obj).booleanValue()) : toPrimitiveValue$toPrimitiveValue(obj.toString());
            }
            return booleanPrimitiveValue;
        } catch (Exception unused) {
            return new StringPrimitiveValue(obj.toString());
        }
    }
}
