package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SearchBarKt$SearchBarInputField$4$1 extends Lambda implements Function1<KeyboardActionScope, Unit> {
    final /* synthetic */ Function1<String, Unit> $onSearch;
    final /* synthetic */ String $query;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBarKt$SearchBarInputField$4$1(Function1<? super String, Unit> function1, String str) {
        super(1);
        this.$onSearch = function1;
        this.$query = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
        invoke2(keyboardActionScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(KeyboardActionScope $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.$onSearch.invoke(this.$query);
    }
}
