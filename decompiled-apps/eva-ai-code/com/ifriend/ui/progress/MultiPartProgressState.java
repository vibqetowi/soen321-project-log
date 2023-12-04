package com.ifriend.ui.progress;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MultiPartProgressState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/ui/progress/MultiPartProgressState;", "", "parts", "", "Lcom/ifriend/ui/progress/MultiPartProgressState$Part;", "(Ljava/util/List;)V", "getParts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Part", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultiPartProgressState {
    public static final int $stable = 8;
    private final List<Part> parts;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiPartProgressState copy$default(MultiPartProgressState multiPartProgressState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = multiPartProgressState.parts;
        }
        return multiPartProgressState.copy(list);
    }

    public final List<Part> component1() {
        return this.parts;
    }

    public final MultiPartProgressState copy(List<Part> parts) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        return new MultiPartProgressState(parts);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiPartProgressState) && Intrinsics.areEqual(this.parts, ((MultiPartProgressState) obj).parts);
    }

    public int hashCode() {
        return this.parts.hashCode();
    }

    public String toString() {
        List<Part> list = this.parts;
        return "MultiPartProgressState(parts=" + list + ")";
    }

    public MultiPartProgressState(List<Part> parts) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.parts = parts;
    }

    public final List<Part> getParts() {
        return this.parts;
    }

    /* compiled from: MultiPartProgressState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/ui/progress/MultiPartProgressState$Part;", "", "weight", "", "progress", "(FF)V", "getProgress", "()F", "getWeight", "setWeight", "(F)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Part {
        public static final int $stable = 8;
        private final float progress;
        private float weight;

        public static /* synthetic */ Part copy$default(Part part, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = part.weight;
            }
            if ((i & 2) != 0) {
                f2 = part.progress;
            }
            return part.copy(f, f2);
        }

        public final float component1() {
            return this.weight;
        }

        public final float component2() {
            return this.progress;
        }

        public final Part copy(float f, float f2) {
            return new Part(f, f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Part) {
                Part part = (Part) obj;
                return Float.compare(this.weight, part.weight) == 0 && Float.compare(this.progress, part.progress) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.weight) * 31) + Float.floatToIntBits(this.progress);
        }

        public String toString() {
            float f = this.weight;
            float f2 = this.progress;
            return "Part(weight=" + f + ", progress=" + f2 + ")";
        }

        public Part(float f, float f2) {
            this.weight = f;
            this.progress = f2;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void setWeight(float f) {
            this.weight = f;
        }

        public final float getProgress() {
            return this.progress;
        }
    }
}
