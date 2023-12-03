package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import com.google.firebase.storage.StorageReference;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: ImageResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", "", "()V", "Cancelled", "Failure", "Pending", "Success", "Uploading", "UploadingStarted", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Cancelled;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Failure;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Pending;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Success;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Uploading;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$UploadingStarted;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public abstract class ImageResponse {

    /* compiled from: ImageResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Cancelled;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Cancelled extends ImageResponse {
        public static final Cancelled INSTANCE = new Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    /* compiled from: ImageResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Failure;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Failure extends ImageResponse {
        private String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String message) {
            super(null);
            i.g(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }

        public final void setMessage(String str) {
            i.g(str, "<set-?>");
            this.message = str;
        }
    }

    /* compiled from: ImageResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Pending;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Pending extends ImageResponse {
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super(null);
        }
    }

    /* compiled from: ImageResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Success;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", "imageUrl", "", "storageRef", "Lcom/google/firebase/storage/StorageReference;", "(Ljava/lang/String;Lcom/google/firebase/storage/StorageReference;)V", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "getStorageRef", "()Lcom/google/firebase/storage/StorageReference;", "setStorageRef", "(Lcom/google/firebase/storage/StorageReference;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Success extends ImageResponse {
        private String imageUrl;
        private StorageReference storageRef;

        public Success() {
            this(null, null, 3, null);
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final StorageReference getStorageRef() {
            return this.storageRef;
        }

        public final void setImageUrl(String str) {
            i.g(str, "<set-?>");
            this.imageUrl = str;
        }

        public final void setStorageRef(StorageReference storageReference) {
            this.storageRef = storageReference;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String imageUrl, StorageReference storageReference) {
            super(null);
            i.g(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.storageRef = storageReference;
        }

        public /* synthetic */ Success(String str, StorageReference storageReference, int i6, d dVar) {
            this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? null : storageReference);
        }
    }

    /* compiled from: ImageResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$Uploading;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", Constants.SCREEN_PROGRESS, "", "(D)V", "getProgress", "()D", "setProgress", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Uploading extends ImageResponse {
        private double progress;

        public Uploading(double d10) {
            super(null);
            this.progress = d10;
        }

        public final double getProgress() {
            return this.progress;
        }

        public final void setProgress(double d10) {
            this.progress = d10;
        }
    }

    /* compiled from: ImageResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/ImageResponse$UploadingStarted;", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class UploadingStarted extends ImageResponse {
        public static final UploadingStarted INSTANCE = new UploadingStarted();

        private UploadingStarted() {
            super(null);
        }
    }

    private ImageResponse() {
    }

    public /* synthetic */ ImageResponse(d dVar) {
        this();
    }
}
