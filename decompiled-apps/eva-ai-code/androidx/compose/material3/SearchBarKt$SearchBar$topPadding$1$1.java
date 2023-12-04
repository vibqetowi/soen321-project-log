package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBarKt$SearchBar$topPadding$1$1 extends Lambda implements Function0<Dp> {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableWindowInsets $unconsumedInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$topPadding$1$1(MutableWindowInsets mutableWindowInsets, Density density) {
        super(0);
        this.$unconsumedInsets = mutableWindowInsets;
        this.$density = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Dp invoke() {
        return Dp.m5605boximpl(m1964invokeD9Ej5fM());
    }

    /* renamed from: invoke-D9Ej5fM  reason: not valid java name */
    public final float m1964invokeD9Ej5fM() {
        return Dp.m5607constructorimpl(SearchBarKt.getSearchBarVerticalPadding() + WindowInsetsKt.asPaddingValues(this.$unconsumedInsets, this.$density).mo700calculateTopPaddingD9Ej5fM());
    }
}
