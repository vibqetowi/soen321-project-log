package com.ifriend.data.config.parser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifriend.domain.config.PrimitiveValue;
import com.ifriend.domain.config.PrimitiveValueKt;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.models.Tag;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
/* compiled from: TagsFirebaseConfigValueParser.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/config/parser/TagsFirebaseConfigValueParser;", "Lcom/ifriend/data/config/parser/FirebaseConfigValueParser;", "tagsProvider", "Lcom/ifriend/domain/data/TagsProvider;", "conditionsChecker", "Lcom/ifriend/data/config/parser/ConditionsChecker;", "(Lcom/ifriend/domain/data/TagsProvider;Lcom/ifriend/data/config/parser/ConditionsChecker;)V", "parse", "Lcom/ifriend/domain/config/PrimitiveValue;", "raw", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagsFirebaseConfigValueParser implements FirebaseConfigValueParser {
    private final ConditionsChecker conditionsChecker;
    private final TagsProvider tagsProvider;

    public TagsFirebaseConfigValueParser(TagsProvider tagsProvider, ConditionsChecker conditionsChecker) {
        Intrinsics.checkNotNullParameter(tagsProvider, "tagsProvider");
        Intrinsics.checkNotNullParameter(conditionsChecker, "conditionsChecker");
        this.tagsProvider = tagsProvider;
        this.conditionsChecker = conditionsChecker;
    }

    @Override // com.ifriend.data.config.parser.FirebaseConfigValueParser
    public Object parse(String str, Continuation<? super PrimitiveValue> continuation) {
        try {
            Gson gson = new Gson();
            Type type = new TypeToken<LinkedHashMap<String, Object>>() { // from class: com.ifriend.data.config.parser.TagsFirebaseConfigValueParser$parse$type$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object fromJson = gson.fromJson(str, type);
            Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
            LinkedHashMap linkedHashMap = (LinkedHashMap) fromJson;
            ConditionsChecker conditionsChecker = this.conditionsChecker;
            Object obj = linkedHashMap.get("@conditions");
            boolean invoke = conditionsChecker.invoke(obj != null ? obj.toString() : null);
            String str2 = "@default";
            if (invoke) {
                Set keySet = linkedHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
                String str3 = null;
                for (Object obj2 : SequencesKt.filter(CollectionsKt.asSequence(keySet), TagsFirebaseConfigValueParser$parse$key$1.INSTANCE)) {
                    String str4 = (String) obj2;
                    Intrinsics.checkNotNull(str4);
                    List split$default = StringsKt.split$default((CharSequence) StringsKt.replace$default(StringsKt.removeSuffix(StringsKt.removePrefix(str4, (CharSequence) "@tags("), (CharSequence) ")"), " ", "", false, 4, (Object) null), new String[]{","}, false, 0, 6, (Object) null);
                    List<Tag> current = this.tagsProvider.current();
                    if (current == null) {
                        current = CollectionsKt.emptyList();
                    }
                    List<Tag> list = current;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (Tag tag : list) {
                        arrayList.add(tag.getValue());
                    }
                    if (arrayList.containsAll(split$default)) {
                        str3 = obj2;
                    }
                }
                String str5 = str3;
                if (str5 != null) {
                    str2 = str5;
                }
            }
            Object obj3 = linkedHashMap.get(str2);
            if (obj3 != null) {
                return PrimitiveValueKt.toPrimitiveValue(obj3);
            }
            return null;
        } catch (Exception unused) {
            return PrimitiveValueKt.toPrimitiveValue(str);
        }
    }
}
