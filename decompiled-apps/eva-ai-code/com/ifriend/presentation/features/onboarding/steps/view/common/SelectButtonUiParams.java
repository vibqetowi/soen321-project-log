package com.ifriend.presentation.features.onboarding.steps.view.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingButtonComponents.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams;", "", "id", "", "text", "selected", "", "style", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams$Style;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams$Style;)V", "getId", "()Ljava/lang/String;", "getSelected", "()Z", "getStyle", "()Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams$Style;", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Style", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectButtonUiParams {
    public static final int $stable = 0;
    private final String id;
    private final boolean selected;
    private final Style style;
    private final String text;

    public static /* synthetic */ SelectButtonUiParams copy$default(SelectButtonUiParams selectButtonUiParams, String str, String str2, boolean z, Style style, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectButtonUiParams.id;
        }
        if ((i & 2) != 0) {
            str2 = selectButtonUiParams.text;
        }
        if ((i & 4) != 0) {
            z = selectButtonUiParams.selected;
        }
        if ((i & 8) != 0) {
            style = selectButtonUiParams.style;
        }
        return selectButtonUiParams.copy(str, str2, z, style);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final Style component4() {
        return this.style;
    }

    public final SelectButtonUiParams copy(String id, String text, boolean z, Style style) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        return new SelectButtonUiParams(id, text, z, style);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectButtonUiParams) {
            SelectButtonUiParams selectButtonUiParams = (SelectButtonUiParams) obj;
            return Intrinsics.areEqual(this.id, selectButtonUiParams.id) && Intrinsics.areEqual(this.text, selectButtonUiParams.text) && this.selected == selectButtonUiParams.selected && this.style == selectButtonUiParams.style;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.text.hashCode()) * 31;
        boolean z = this.selected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.style.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        boolean z = this.selected;
        Style style = this.style;
        return "SelectButtonUiParams(id=" + str + ", text=" + str2 + ", selected=" + z + ", style=" + style + ")";
    }

    public SelectButtonUiParams(String id, String text, boolean z, Style style) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.id = id;
        this.text = text;
        this.selected = z;
        this.style = style;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final Style getStyle() {
        return this.style;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnboardingButtonComponents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams$Style;", "", "(Ljava/lang/String;I)V", "Regular", "Primary", "Secondary", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Style {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style Regular = new Style("Regular", 0);
        public static final Style Primary = new Style("Primary", 1);
        public static final Style Secondary = new Style("Secondary", 2);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{Regular, Primary, Secondary};
        }

        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        private Style(String str, int i) {
        }

        static {
            Style[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
