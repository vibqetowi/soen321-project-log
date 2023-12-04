package com.google.common.escape;

import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;
@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public abstract class Escaper {
    private final Function<String, String> asFunction = new Function<String, String>() { // from class: com.google.common.escape.Escaper.1
        @Override // com.google.common.base.Function
        public String apply(String str) {
            return Escaper.this.escape(str);
        }
    };

    public abstract String escape(String str);

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }
}
