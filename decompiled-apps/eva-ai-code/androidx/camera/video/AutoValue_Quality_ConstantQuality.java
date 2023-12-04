package androidx.camera.video;

import androidx.camera.video.Quality;
/* loaded from: classes.dex */
final class AutoValue_Quality_ConstantQuality extends Quality.ConstantQuality {
    private final String name;
    private final int value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Quality_ConstantQuality(int i, String str) {
        this.value = i;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.name = str;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    int getValue() {
        return this.value;
    }

    @Override // androidx.camera.video.Quality.ConstantQuality
    String getName() {
        return this.name;
    }

    public String toString() {
        return "ConstantQuality{value=" + this.value + ", name=" + this.name + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Quality.ConstantQuality) {
            Quality.ConstantQuality constantQuality = (Quality.ConstantQuality) obj;
            return this.value == constantQuality.getValue() && this.name.equals(constantQuality.getName());
        }
        return false;
    }

    public int hashCode() {
        return ((this.value ^ 1000003) * 1000003) ^ this.name.hashCode();
    }
}
