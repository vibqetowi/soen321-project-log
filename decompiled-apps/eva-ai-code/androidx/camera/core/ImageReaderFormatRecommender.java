package androidx.camera.core;
/* loaded from: classes.dex */
final class ImageReaderFormatRecommender {
    private ImageReaderFormatRecommender() {
    }

    static FormatCombo chooseCombo() {
        return FormatCombo.create(256, 35);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class FormatCombo {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int imageAnalysisFormat();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int imageCaptureFormat();

        static FormatCombo create(int i, int i2) {
            return new AutoValue_ImageReaderFormatRecommender_FormatCombo(i, i2);
        }
    }
}
