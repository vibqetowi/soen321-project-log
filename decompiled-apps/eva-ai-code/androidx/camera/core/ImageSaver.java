package androidx.camera.core;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImageSaver implements Runnable {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final String TAG = "ImageSaver";
    private static final String TEMP_FILE_PREFIX = "CameraX";
    private static final String TEMP_FILE_SUFFIX = ".tmp";
    private final OnImageSavedCallback mCallback;
    private final ImageProxy mImage;
    private final int mJpegQuality;
    private final int mOrientation;
    private final ImageCapture.OutputFileOptions mOutputFileOptions;
    private final Executor mSequentialIoExecutor;
    private final Executor mUserCallbackExecutor;

    /* loaded from: classes.dex */
    public interface OnImageSavedCallback {
        void onError(SaveError saveError, String str, Throwable th);

        void onImageSaved(ImageCapture.OutputFileResults outputFileResults);
    }

    /* loaded from: classes.dex */
    public enum SaveError {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageSaver(ImageProxy imageProxy, ImageCapture.OutputFileOptions outputFileOptions, int i, int i2, Executor executor, Executor executor2, OnImageSavedCallback onImageSavedCallback) {
        this.mImage = imageProxy;
        this.mOutputFileOptions = outputFileOptions;
        this.mOrientation = i;
        this.mJpegQuality = i2;
        this.mCallback = onImageSavedCallback;
        this.mUserCallbackExecutor = executor;
        this.mSequentialIoExecutor = executor2;
    }

    @Override // java.lang.Runnable
    public void run() {
        final File saveImageToTempFile = saveImageToTempFile();
        if (saveImageToTempFile != null) {
            this.mSequentialIoExecutor.execute(new Runnable() { // from class: androidx.camera.core.ImageSaver$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageSaver.this.m160lambda$run$0$androidxcameracoreImageSaver(saveImageToTempFile);
                }
            });
        }
    }

    private File saveImageToTempFile() {
        File createTempFile;
        SaveError saveError;
        String str;
        ImageUtil.CodecFailedException codecFailedException;
        try {
            if (isSaveToFile()) {
                createTempFile = new File(this.mOutputFileOptions.getFile().getParent(), TEMP_FILE_PREFIX + UUID.randomUUID().toString() + ".tmp");
            } else {
                createTempFile = File.createTempFile(TEMP_FILE_PREFIX, ".tmp");
            }
            try {
                ImageProxy imageProxy = this.mImage;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    fileOutputStream.write(imageToJpegByteArray(this.mImage, this.mJpegQuality));
                    Exif createFromFile = Exif.createFromFile(createTempFile);
                    Exif.createFromImageProxy(this.mImage).copyToCroppedImage(createFromFile);
                    if (!new ExifRotationAvailability().shouldUseExifOrientation(this.mImage)) {
                        createFromFile.rotate(this.mOrientation);
                    }
                    ImageCapture.Metadata metadata = this.mOutputFileOptions.getMetadata();
                    if (metadata.isReversedHorizontal()) {
                        createFromFile.flipHorizontally();
                    }
                    if (metadata.isReversedVertical()) {
                        createFromFile.flipVertically();
                    }
                    if (metadata.getLocation() != null) {
                        createFromFile.attachLocation(this.mOutputFileOptions.getMetadata().getLocation());
                    }
                    createFromFile.save();
                    fileOutputStream.close();
                    if (imageProxy != null) {
                        imageProxy.close();
                    }
                    codecFailedException = null;
                    saveError = null;
                    str = null;
                } catch (Throwable th) {
                    if (imageProxy != null) {
                        try {
                            imageProxy.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (ImageUtil.CodecFailedException e) {
                int i = AnonymousClass1.$SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType[e.getFailureType().ordinal()];
                if (i == 1) {
                    saveError = SaveError.ENCODE_FAILED;
                    str = "Failed to encode mImage";
                    codecFailedException = e;
                } else if (i == 2) {
                    saveError = SaveError.CROP_FAILED;
                    str = "Failed to crop mImage";
                    codecFailedException = e;
                } else {
                    saveError = SaveError.UNKNOWN;
                    str = "Failed to transcode mImage";
                    codecFailedException = e;
                }
            } catch (IOException e2) {
                e = e2;
                saveError = SaveError.FILE_IO_FAILED;
                str = "Failed to write temp file";
                codecFailedException = e;
            } catch (IllegalArgumentException e3) {
                e = e3;
                saveError = SaveError.FILE_IO_FAILED;
                str = "Failed to write temp file";
                codecFailedException = e;
            }
            if (saveError != null) {
                postError(saveError, str, codecFailedException);
                createTempFile.delete();
                return null;
            }
            return createTempFile;
        } catch (IOException e4) {
            postError(SaveError.FILE_IO_FAILED, "Failed to create temp file", e4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.ImageSaver$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType;

        static {
            int[] iArr = new int[ImageUtil.CodecFailedException.FailureType.values().length];
            $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType = iArr;
            try {
                iArr[ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType[ImageUtil.CodecFailedException.FailureType.DECODE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$internal$utils$ImageUtil$CodecFailedException$FailureType[ImageUtil.CodecFailedException.FailureType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private byte[] imageToJpegByteArray(ImageProxy imageProxy, int i) throws ImageUtil.CodecFailedException {
        boolean shouldCropImage = ImageUtil.shouldCropImage(imageProxy);
        int format = imageProxy.getFormat();
        if (format == 256) {
            if (!shouldCropImage) {
                return ImageUtil.jpegImageToJpegByteArray(imageProxy);
            }
            return ImageUtil.jpegImageToJpegByteArray(imageProxy, imageProxy.getCropRect(), i);
        }
        if (format == 35) {
            return ImageUtil.yuvImageToJpegByteArray(imageProxy, shouldCropImage ? imageProxy.getCropRect() : null, i);
        }
        Logger.w(TAG, "Unrecognized image format: " + format);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* renamed from: copyTempFileToDestination */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m160lambda$run$0$androidxcameracoreImageSaver(File file) {
        Uri uri;
        SaveError saveError;
        String str;
        ContentValues contentValues;
        Preconditions.checkNotNull(file);
        Throwable e = null;
        try {
            try {
                if (isSaveToMediaStore()) {
                    if (this.mOutputFileOptions.getContentValues() != null) {
                        contentValues = new ContentValues(this.mOutputFileOptions.getContentValues());
                    } else {
                        contentValues = new ContentValues();
                    }
                    setContentValuePending(contentValues, 1);
                    uri = this.mOutputFileOptions.getContentResolver().insert(this.mOutputFileOptions.getSaveCollection(), contentValues);
                    try {
                        if (uri == null) {
                            saveError = SaveError.FILE_IO_FAILED;
                            str = "Failed to insert URI.";
                        } else {
                            if (copyTempFileToUri(file, uri)) {
                                saveError = null;
                                str = null;
                            } else {
                                saveError = SaveError.FILE_IO_FAILED;
                                str = "Failed to save to URI.";
                            }
                            setUriNotPending(uri);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        saveError = SaveError.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                        if (saveError != null) {
                        }
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        saveError = SaveError.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                        if (saveError != null) {
                        }
                    }
                } else {
                    if (isSaveToOutputStream()) {
                        copyTempFileToOutputStream(file, this.mOutputFileOptions.getOutputStream());
                    } else if (isSaveToFile()) {
                        File file2 = this.mOutputFileOptions.getFile();
                        if (file2.exists()) {
                            file2.delete();
                        }
                        if (file.renameTo(file2)) {
                            saveError = null;
                            str = null;
                        } else {
                            saveError = SaveError.FILE_IO_FAILED;
                            str = "Failed to rename file.";
                        }
                        uri = Uri.fromFile(file2);
                    }
                    uri = null;
                    saveError = null;
                    str = null;
                }
            } finally {
                file.delete();
            }
        } catch (IOException | IllegalArgumentException e4) {
            uri = null;
            e = e4;
        }
        if (saveError != null) {
            postError(saveError, str, e);
        } else {
            postSuccess(uri);
        }
    }

    private boolean isSaveToMediaStore() {
        return (this.mOutputFileOptions.getSaveCollection() == null || this.mOutputFileOptions.getContentResolver() == null || this.mOutputFileOptions.getContentValues() == null) ? false : true;
    }

    private boolean isSaveToFile() {
        return this.mOutputFileOptions.getFile() != null;
    }

    private boolean isSaveToOutputStream() {
        return this.mOutputFileOptions.getOutputStream() != null;
    }

    private void setUriNotPending(Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            setContentValuePending(contentValues, 0);
            this.mOutputFileOptions.getContentResolver().update(uri, contentValues, null, null);
        }
    }

    private void setContentValuePending(ContentValues contentValues, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i));
        }
    }

    private boolean copyTempFileToUri(File file, Uri uri) throws IOException {
        OutputStream openOutputStream = this.mOutputFileOptions.getContentResolver().openOutputStream(uri);
        if (openOutputStream == null) {
            if (openOutputStream != null) {
                openOutputStream.close();
                return false;
            }
            return false;
        }
        try {
            copyTempFileToOutputStream(file, openOutputStream);
            if (openOutputStream != null) {
                openOutputStream.close();
                return true;
            }
            return true;
        } catch (Throwable th) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void copyTempFileToOutputStream(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void postSuccess(final Uri uri) {
        try {
            this.mUserCallbackExecutor.execute(new Runnable() { // from class: androidx.camera.core.ImageSaver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageSaver.this.m159lambda$postSuccess$1$androidxcameracoreImageSaver(uri);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e(TAG, "Application executor rejected executing OnImageSavedCallback.onImageSaved callback. Skipping.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$postSuccess$1$androidx-camera-core-ImageSaver  reason: not valid java name */
    public /* synthetic */ void m159lambda$postSuccess$1$androidxcameracoreImageSaver(Uri uri) {
        this.mCallback.onImageSaved(new ImageCapture.OutputFileResults(uri));
    }

    private void postError(final SaveError saveError, final String str, final Throwable th) {
        try {
            this.mUserCallbackExecutor.execute(new Runnable() { // from class: androidx.camera.core.ImageSaver$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageSaver.this.m158lambda$postError$2$androidxcameracoreImageSaver(saveError, str, th);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e(TAG, "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$postError$2$androidx-camera-core-ImageSaver  reason: not valid java name */
    public /* synthetic */ void m158lambda$postError$2$androidxcameracoreImageSaver(SaveError saveError, String str, Throwable th) {
        this.mCallback.onError(saveError, str, th);
    }
}
