package com.ifriend.domain.config;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.models.Tag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LocalDefaultsConfigBuilder.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJR\u0010\u0010\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u0002H\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0016\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\u0010\u0018JO\u0010\u0010\u001a\u00020\f\"\b\b\u0000\u0010\u0011*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u00112\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001a0\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder;", "", "experimentalTags", "", "Lcom/ifriend/domain/models/Tag;", "(Ljava/util/List;)V", "config", "", "Lcom/ifriend/domain/config/ConfigEntity;", "getConfig", "()Ljava/util/List;", "endpoint", "", "key", "", "value", "feature", ExifInterface.GPS_DIRECTION_TRUE, CookieSpecs.DEFAULT, "payload", "initializer", "Lkotlin/Function1;", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "conditions", "Lkotlin/Pair;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;)V", "link", "version", "Companion", "FeatureBuilder", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalDefaultsConfigBuilder {
    public static final Companion Companion = new Companion(null);
    private final List<ConfigEntity> config;
    private final List<Tag> experimentalTags;

    public LocalDefaultsConfigBuilder(List<Tag> experimentalTags) {
        Intrinsics.checkNotNullParameter(experimentalTags, "experimentalTags");
        this.experimentalTags = experimentalTags;
        this.config = new ArrayList();
    }

    /* compiled from: LocalDefaultsConfigBuilder.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$Companion;", "", "()V", "config", "", "Lcom/ifriend/domain/config/ConfigEntity;", "experimentalTags", "Lcom/ifriend/domain/models/Tag;", "initializer", "Lkotlin/Function2;", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object config(List<Tag> list, Function2<? super LocalDefaultsConfigBuilder, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super List<ConfigEntity>> continuation) {
            LocalDefaultsConfigBuilder$Companion$config$1 localDefaultsConfigBuilder$Companion$config$1;
            int i;
            LocalDefaultsConfigBuilder localDefaultsConfigBuilder;
            if (continuation instanceof LocalDefaultsConfigBuilder$Companion$config$1) {
                localDefaultsConfigBuilder$Companion$config$1 = (LocalDefaultsConfigBuilder$Companion$config$1) continuation;
                if ((localDefaultsConfigBuilder$Companion$config$1.label & Integer.MIN_VALUE) != 0) {
                    localDefaultsConfigBuilder$Companion$config$1.label -= Integer.MIN_VALUE;
                    Object obj = localDefaultsConfigBuilder$Companion$config$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = localDefaultsConfigBuilder$Companion$config$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        LocalDefaultsConfigBuilder localDefaultsConfigBuilder2 = new LocalDefaultsConfigBuilder(list);
                        localDefaultsConfigBuilder$Companion$config$1.L$0 = localDefaultsConfigBuilder2;
                        localDefaultsConfigBuilder$Companion$config$1.label = 1;
                        if (function2.invoke(localDefaultsConfigBuilder2, localDefaultsConfigBuilder$Companion$config$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        localDefaultsConfigBuilder = localDefaultsConfigBuilder2;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        localDefaultsConfigBuilder = (LocalDefaultsConfigBuilder) localDefaultsConfigBuilder$Companion$config$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return localDefaultsConfigBuilder.getConfig();
                }
            }
            localDefaultsConfigBuilder$Companion$config$1 = new LocalDefaultsConfigBuilder$Companion$config$1(this, continuation);
            Object obj2 = localDefaultsConfigBuilder$Companion$config$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = localDefaultsConfigBuilder$Companion$config$1.label;
            if (i != 0) {
            }
            return localDefaultsConfigBuilder.getConfig();
        }
    }

    public final List<ConfigEntity> getConfig() {
        return this.config;
    }

    public final void link(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.config.add(new ConfigEntity(AppconfigKt.appLinkKey(key), new StringPrimitiveValue(value), null, null, 12, null));
    }

    public final void endpoint(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.config.add(new ConfigEntity(AppconfigKt.appEndpointKey(key), new StringPrimitiveValue(value), null, null, 12, null));
    }

    public final void version(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.config.add(new ConfigEntity(AppconfigKt.appVersionKey(key), new StringPrimitiveValue(value), null, null, 12, null));
    }

    /* compiled from: LocalDefaultsConfigBuilder.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001!B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J \u0010\u001a\u001a\u00020\u001b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00100\u001cJ!\u0010\u001d\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0002\u0010 RV\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t`\n2\"\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t`\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "", CookieSpecs.DEFAULT, "(Ljava/lang/String;Ljava/lang/Object;)V", "<set-?>", "Ljava/util/ArrayList;", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder$TagsCondition;", "Lkotlin/collections/ArrayList;", "conditions", "getConditions", "()Ljava/util/ArrayList;", "configConditions", "", "Lkotlin/Pair;", "getConfigConditions", "()Ljava/util/List;", "getDefault", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "addConditions", "", "", "byTags", "tags", "value", "(Ljava/util/List;Ljava/lang/Object;)V", "TagsCondition", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class FeatureBuilder<T> {
        private ArrayList<TagsCondition<T>> conditions;
        private final List<Pair<String, String>> configConditions;

        /* renamed from: default  reason: not valid java name */
        private final T f73default;
        private String key;

        public FeatureBuilder(String key, T t) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.f73default = t;
            this.configConditions = new ArrayList();
            this.conditions = new ArrayList<>();
        }

        public final String getKey() {
            return this.key;
        }

        public final void setKey(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.key = str;
        }

        public final T getDefault() {
            return this.f73default;
        }

        public final List<Pair<String, String>> getConfigConditions() {
            return this.configConditions;
        }

        public final ArrayList<TagsCondition<T>> getConditions() {
            return this.conditions;
        }

        public final void byTags(List<String> tags, T t) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.conditions.add(new TagsCondition<>(tags, t));
        }

        public final void addConditions(List<Pair<String, String>> conditions) {
            Intrinsics.checkNotNullParameter(conditions, "conditions");
            this.configConditions.addAll(conditions);
        }

        /* compiled from: LocalDefaultsConfigBuilder.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder$TagsCondition;", ExifInterface.GPS_DIRECTION_TRUE, "", "tags", "", "", "value", "(Ljava/util/List;Ljava/lang/Object;)V", "getTags", "()Ljava/util/List;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class TagsCondition<T> {
            private final List<String> tags;
            private final T value;

            public TagsCondition(List<String> tags, T t) {
                Intrinsics.checkNotNullParameter(tags, "tags");
                this.tags = tags;
                this.value = t;
            }

            public final List<String> getTags() {
                return this.tags;
            }

            public final T getValue() {
                return this.value;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void feature$default(LocalDefaultsConfigBuilder localDefaultsConfigBuilder, String str, Object obj, List list, String str2, int i, Object obj2) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        localDefaultsConfigBuilder.feature(str, (String) obj, (List<Pair<String, String>>) list, str2);
    }

    private final <T> void feature(String str, T t, List<Pair<String, String>> list, String str2) {
        this.config.add(new ConfigEntity(AppconfigKt.appFeatureKey(str), PrimitiveValueKt.toPrimitiveValue(t), list, str2));
    }

    public static /* synthetic */ void feature$default(LocalDefaultsConfigBuilder localDefaultsConfigBuilder, String str, Object obj, String str2, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            function1 = LocalDefaultsConfigBuilder$feature$1.INSTANCE;
        }
        localDefaultsConfigBuilder.feature(str, (String) obj, str2, (Function1<? super FeatureBuilder<String>, Unit>) function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void feature(String key, T t, String str, Function1<? super FeatureBuilder<T>, Unit> initializer) {
        T t2;
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t, "default");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        FeatureBuilder featureBuilder = new FeatureBuilder(key, t);
        initializer.invoke(featureBuilder);
        List<Tag> list = this.experimentalTags;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Tag tag : list) {
            arrayList.add(tag.getValue());
        }
        ArrayList arrayList2 = arrayList;
        Iterator<T> it = featureBuilder.getConditions().iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (arrayList2.containsAll(((FeatureBuilder.TagsCondition) t2).getTags())) {
                break;
            }
        }
        FeatureBuilder.TagsCondition tagsCondition = (FeatureBuilder.TagsCondition) t2;
        if (tagsCondition == null || (obj = tagsCondition.getValue()) == null) {
            obj = featureBuilder.getDefault();
        }
        feature(featureBuilder.getKey(), (String) obj, featureBuilder.getConfigConditions(), str);
    }
}
