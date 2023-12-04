package com.ifriend.domain.config;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.profile.bot.Bot;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ConfigEntityExt.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"ethnicity", "", "Lcom/ifriend/domain/config/ConfigEntity;", "getEthnicity", "(Lcom/ifriend/domain/config/ConfigEntity;)Ljava/lang/String;", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "isAiPhotoEnabled", "", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigEntityExtKt {
    public static final String getGender(ConfigEntity configEntity) {
        Object obj;
        Intrinsics.checkNotNullParameter(configEntity, "<this>");
        Iterator<T> it = configEntity.getConditions().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Pair) obj).getFirst(), ConfigsKey.GENDER.getKey())) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            return (String) pair.getSecond();
        }
        return null;
    }

    public static final String getEthnicity(ConfigEntity configEntity) {
        Object obj;
        Intrinsics.checkNotNullParameter(configEntity, "<this>");
        Iterator<T> it = configEntity.getConditions().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Pair) obj).getFirst(), ConfigsKey.ETHNICITY.getKey())) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            return (String) pair.getSecond();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r4) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isAiPhotoEnabled(ConfigEntity configEntity, Bot bot) {
        String str;
        boolean z;
        String ethnicity;
        String str2;
        String upperCase;
        boolean z2;
        Intrinsics.checkNotNullParameter(bot, "bot");
        if (configEntity == null) {
            return false;
        }
        String gender = getGender(configEntity);
        String str3 = null;
        if (gender != null) {
            str = gender.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str = null;
        }
        String str4 = str;
        if (!(str4 == null || StringsKt.isBlank(str4))) {
            if (bot.getGender() != null) {
                String upperCase2 = bot.getGender().name().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            z = false;
            ethnicity = getEthnicity(configEntity);
            if (ethnicity != null) {
                str3 = ethnicity.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            str2 = str3;
            if (!(str2 != null || StringsKt.isBlank(str2)) && bot.getEthnicity() != null) {
                upperCase = bot.getEthnicity().name().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (!Intrinsics.areEqual(str3, upperCase)) {
                    z2 = false;
                    return z && z2;
                }
            }
            z2 = true;
            if (z) {
                return false;
            }
        }
        z = true;
        ethnicity = getEthnicity(configEntity);
        if (ethnicity != null) {
        }
        str2 = str3;
        if (!(str2 != null || StringsKt.isBlank(str2))) {
            upperCase = bot.getEthnicity().name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (!Intrinsics.areEqual(str3, upperCase)) {
            }
        }
        z2 = true;
        if (z) {
        }
    }
}
