package kotlinx.serialization;

import com.facebook.share.internal.ShareConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SerializationException.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\b\u0010\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u001b\b\u0000\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "fieldName", "", "(Ljava/lang/String;)V", "fieldNames", "", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MissingFieldException extends SerializationException {
    public MissingFieldException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String fieldName) {
        this("Field '" + fieldName + "' is required, but it was missing", (Throwable) null);
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingFieldException(List<String> fieldNames, String serialName) {
        this(r0.toString(), (Throwable) null);
        StringBuilder sb;
        String str;
        Intrinsics.checkNotNullParameter(fieldNames, "fieldNames");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        if (fieldNames.size() == 1) {
            sb = new StringBuilder("Field '");
            sb.append(fieldNames.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(serialName);
            str = "', but it was missing";
        } else {
            sb = new StringBuilder("Fields ");
            sb.append(fieldNames);
            sb.append(" are required for type with serial name '");
            sb.append(serialName);
            str = "', but they were missing";
        }
        sb.append(str);
    }
}
