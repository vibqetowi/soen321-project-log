package com.ifriend.registration.presentation.bridges.facebook;

import androidx.autofill.HintConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.common_utils.Format;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.infrastructure.UtilsKt;
import com.ifriend.registration.domain.useCase.facebook.FacebookAccountData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
/* compiled from: FacebookAuthorizationResponseParser.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ifriend/registration/presentation/bridges/facebook/FacebookAuthorizationResponseParser;", "", "()V", "fetchBirthday", "Lcom/ifriend/domain/models/profile/Birthday;", "obj", "Lorg/json/JSONObject;", "fetchEmail", "", "fetchGender", "Lcom/ifriend/domain/models/profile/Gender;", "fetchName", "parseLoginJsonResponseObject", "Lcom/ifriend/registration/domain/useCase/facebook/FacebookAccountData;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FacebookAuthorizationResponseParser {
    public static final int $stable = 0;

    public final FacebookAccountData parseLoginJsonResponseObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return (FacebookAccountData) UtilsKt.unexpectedNull();
        }
        return new FacebookAccountData(fetchEmail(jSONObject), fetchName(jSONObject), fetchGender(jSONObject), fetchBirthday(jSONObject));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if ((r0 != null ? r0 instanceof java.lang.String : true) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String fetchEmail(JSONObject jSONObject) {
        Object obj;
        String str = null;
        if (jSONObject.has("email")) {
            obj = jSONObject.get("email");
        }
        obj = null;
        String str2 = (String) obj;
        if (str2 == null) {
            if (jSONObject.has("id")) {
                Object obj2 = jSONObject.get("id");
                if (obj2 != null ? obj2 instanceof String : true) {
                    str = obj2;
                }
            }
            return "fb-" + str + "@ifriend.ai";
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if ((r4 != null ? r4 instanceof java.lang.String : true) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Gender fetchGender(JSONObject jSONObject) {
        Object obj;
        if (jSONObject.has(HintConstants.AUTOFILL_HINT_GENDER)) {
            obj = jSONObject.get(HintConstants.AUTOFILL_HINT_GENDER);
        }
        obj = null;
        String str = (String) obj;
        if (Intrinsics.areEqual(str, "male")) {
            return Gender.MALE;
        }
        if (Intrinsics.areEqual(str, "female")) {
            return Gender.FEMALE;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if ((r11 != null ? r11 instanceof java.lang.String : true) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Birthday fetchBirthday(JSONObject jSONObject) {
        Object obj;
        if (jSONObject.has("birthday")) {
            obj = jSONObject.get("birthday");
        }
        obj = null;
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        String str2 = str;
        if (str2.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : StringsKt.split$default((CharSequence) str2, new String[]{RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (Object) null)) {
            Integer intOrNull = StringsKt.toIntOrNull(str3);
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() < 3) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, ((Number) arrayList2.get(1)).intValue());
        calendar.set(2, ((Number) arrayList2.get(0)).intValue());
        calendar.set(1, ((Number) arrayList2.get(2)).intValue());
        Format format = Format.INSTANCE;
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return Birthday.Companion.fromDatetime(format.dateToString(time));
    }

    private final String fetchName(JSONObject jSONObject) {
        String str = null;
        if (jSONObject.has("first_name")) {
            Object obj = jSONObject.get("first_name");
            if (obj != null ? obj instanceof String : true) {
                str = obj;
            }
        }
        return str;
    }
}
