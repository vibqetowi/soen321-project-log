package io.opencensus.tags.propagation;

import io.opencensus.tags.TagContext;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public abstract class TagContextTextFormat {

    /* loaded from: classes4.dex */
    public static abstract class Getter<C> {
        @Nullable
        public abstract String get(C c, String str);
    }

    /* loaded from: classes4.dex */
    public static abstract class Setter<C> {
        public abstract void put(C c, String str, String str2);
    }

    public abstract <C> TagContext extract(C c, Getter<C> getter) throws TagContextDeserializationException;

    public abstract List<String> fields();

    public abstract <C> void inject(TagContext tagContext, C c, Setter<C> setter) throws TagContextSerializationException;
}
