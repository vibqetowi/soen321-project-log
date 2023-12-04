package com.ifriend.data.config.parser;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.models.profile.bot.Personality;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: ConditionsChecker.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000e\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u0010\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/data/config/parser/ConditionsChecker;", "", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/common_utils/Logger;)V", "checkAge", "", "conditions", "", "", "bot", "Lcom/ifriend/domain/models/profile/bot/Bot;", "checkEthnicity", "checkGender", "checkPersonality", "invoke", "ConditionKey", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConditionsChecker {
    private final BotRepository botRepository;
    private final Logger logger;

    public ConditionsChecker(BotRepository botRepository, Logger logger) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.botRepository = botRepository;
        this.logger = logger;
    }

    public final boolean invoke(String str) {
        boolean z;
        Bot currentBot = this.botRepository.getCurrentBot();
        if (str != null && currentBot != null) {
            try {
                List<String> split$default = StringsKt.split$default((CharSequence) StringsKt.replace$default(str, " ", "", false, 4, (Object) null), new String[]{";"}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
                for (String str2 : split$default) {
                    arrayList.add(StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null));
                }
                ArrayList<List> arrayList2 = arrayList;
                ArrayList<Pair> arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (List list : arrayList2) {
                    arrayList3.add(TuplesKt.to(list.get(0), StringsKt.split$default((CharSequence) list.get(1), new String[]{"|"}, false, 0, 6, (Object) null)));
                }
                for (Pair pair : arrayList3) {
                    String lowerCase = ((String) pair.getFirst()).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = "AGE".toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                        z = checkAge((List) pair.getSecond(), currentBot);
                        continue;
                    } else {
                        String lowerCase3 = "GENDER".toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase, lowerCase3)) {
                            z = checkGender((List) pair.getSecond(), currentBot);
                            continue;
                        } else {
                            String lowerCase4 = "ETHNICITY".toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (Intrinsics.areEqual(lowerCase, lowerCase4)) {
                                z = checkEthnicity((List) pair.getSecond(), currentBot);
                                continue;
                            } else {
                                String lowerCase5 = "PERSONALITY".toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                if (Intrinsics.areEqual(lowerCase, lowerCase5)) {
                                    z = checkPersonality((List) pair.getSecond(), currentBot);
                                    continue;
                                } else {
                                    Logger.DefaultImpls.error$default(this.logger, "Unexpected condition key: " + pair.getFirst(), null, 2, null);
                                    z = true;
                                    continue;
                                }
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } catch (Exception e) {
                this.logger.logException(e);
            }
        }
        return true;
    }

    private final boolean checkAge(List<String> list, Bot bot) {
        boolean z;
        if (bot.getBirthday() == null) {
            return true;
        }
        Birthday birthday = bot.getBirthday();
        String valueOf = String.valueOf(birthday != null ? Integer.valueOf(birthday.getAge()) : null);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (String str : list2) {
            arrayList.add(StringsKt.split$default((CharSequence) str, new String[]{"-"}, false, 0, 6, (Object) null));
        }
        ArrayList<List> arrayList2 = arrayList;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            for (List list3 : arrayList2) {
                String str2 = (String) CollectionsKt.first((List<? extends Object>) list3);
                if (valueOf.compareTo((String) CollectionsKt.last((List<? extends Object>) list3)) > 0 || valueOf.compareTo(str2) < 0) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean checkGender(List<String> list, Bot bot) {
        Gender gender = bot.getGender();
        if (gender == null) {
            return true;
        }
        List<String> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (String str : list2) {
                String lowerCase = gender.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (Intrinsics.areEqual(str, lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean checkEthnicity(List<String> list, Bot bot) {
        Ethnicity ethnicity = bot.getEthnicity();
        if (ethnicity == null) {
            return true;
        }
        List<String> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (String str : list2) {
                String lowerCase = ethnicity.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (Intrinsics.areEqual(str, lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean checkPersonality(List<String> list, Bot bot) {
        Personality personality = bot.getPersonality();
        if (personality == null) {
            return true;
        }
        List<String> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (String str : list2) {
                String lowerCase = personality.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (Intrinsics.areEqual(str, lowerCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConditionsChecker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/config/parser/ConditionsChecker$ConditionKey;", "", "(Ljava/lang/String;I)V", "AGE", "GENDER", "ETHNICITY", "PERSONALITY", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class ConditionKey {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConditionKey[] $VALUES;
        public static final ConditionKey AGE = new ConditionKey("AGE", 0);
        public static final ConditionKey GENDER = new ConditionKey("GENDER", 1);
        public static final ConditionKey ETHNICITY = new ConditionKey("ETHNICITY", 2);
        public static final ConditionKey PERSONALITY = new ConditionKey("PERSONALITY", 3);

        private static final /* synthetic */ ConditionKey[] $values() {
            return new ConditionKey[]{AGE, GENDER, ETHNICITY, PERSONALITY};
        }

        public static EnumEntries<ConditionKey> getEntries() {
            return $ENTRIES;
        }

        public static ConditionKey valueOf(String str) {
            return (ConditionKey) Enum.valueOf(ConditionKey.class, str);
        }

        public static ConditionKey[] values() {
            return (ConditionKey[]) $VALUES.clone();
        }

        private ConditionKey(String str, int i) {
        }

        static {
            ConditionKey[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
