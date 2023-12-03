package com.theinnerhour.b2b.components.journal.model;

import android.net.Uri;
import com.appsflyer.R;
import com.google.firebase.storage.StorageReference;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
/* compiled from: JournalAttachImageModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/JournalAttachImageModel;", "", Constants.SCREEN_PROGRESS, "", "imageLink", "Landroid/net/Uri;", "imageUploadStatus", "Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", "imageUploadedURL", "", "storageRef", "Lcom/google/firebase/storage/StorageReference;", "(DLandroid/net/Uri;Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;Ljava/lang/String;Lcom/google/firebase/storage/StorageReference;)V", "getImageLink", "()Landroid/net/Uri;", "getImageUploadStatus", "()Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;", "setImageUploadStatus", "(Lcom/theinnerhour/b2b/components/journal/model/ImageResponse;)V", "getImageUploadedURL", "()Ljava/lang/String;", "setImageUploadedURL", "(Ljava/lang/String;)V", "getProgress", "()D", "setProgress", "(D)V", "getStorageRef", "()Lcom/google/firebase/storage/StorageReference;", "setStorageRef", "(Lcom/google/firebase/storage/StorageReference;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class JournalAttachImageModel {
    private final Uri imageLink;
    private ImageResponse imageUploadStatus;
    private String imageUploadedURL;
    private double progress;
    private StorageReference storageRef;

    public JournalAttachImageModel(double d10, Uri uri, ImageResponse imageUploadStatus, String imageUploadedURL, StorageReference storageReference) {
        i.g(imageUploadStatus, "imageUploadStatus");
        i.g(imageUploadedURL, "imageUploadedURL");
        this.progress = d10;
        this.imageLink = uri;
        this.imageUploadStatus = imageUploadStatus;
        this.imageUploadedURL = imageUploadedURL;
        this.storageRef = storageReference;
    }

    public static /* synthetic */ JournalAttachImageModel copy$default(JournalAttachImageModel journalAttachImageModel, double d10, Uri uri, ImageResponse imageResponse, String str, StorageReference storageReference, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            d10 = journalAttachImageModel.progress;
        }
        double d11 = d10;
        if ((i6 & 2) != 0) {
            uri = journalAttachImageModel.imageLink;
        }
        Uri uri2 = uri;
        if ((i6 & 4) != 0) {
            imageResponse = journalAttachImageModel.imageUploadStatus;
        }
        ImageResponse imageResponse2 = imageResponse;
        if ((i6 & 8) != 0) {
            str = journalAttachImageModel.imageUploadedURL;
        }
        String str2 = str;
        if ((i6 & 16) != 0) {
            storageReference = journalAttachImageModel.storageRef;
        }
        return journalAttachImageModel.copy(d11, uri2, imageResponse2, str2, storageReference);
    }

    public final double component1() {
        return this.progress;
    }

    public final Uri component2() {
        return this.imageLink;
    }

    public final ImageResponse component3() {
        return this.imageUploadStatus;
    }

    public final String component4() {
        return this.imageUploadedURL;
    }

    public final StorageReference component5() {
        return this.storageRef;
    }

    public final JournalAttachImageModel copy(double d10, Uri uri, ImageResponse imageUploadStatus, String imageUploadedURL, StorageReference storageReference) {
        i.g(imageUploadStatus, "imageUploadStatus");
        i.g(imageUploadedURL, "imageUploadedURL");
        return new JournalAttachImageModel(d10, uri, imageUploadStatus, imageUploadedURL, storageReference);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JournalAttachImageModel)) {
            return false;
        }
        JournalAttachImageModel journalAttachImageModel = (JournalAttachImageModel) obj;
        if (Double.compare(this.progress, journalAttachImageModel.progress) == 0 && i.b(this.imageLink, journalAttachImageModel.imageLink) && i.b(this.imageUploadStatus, journalAttachImageModel.imageUploadStatus) && i.b(this.imageUploadedURL, journalAttachImageModel.imageUploadedURL) && i.b(this.storageRef, journalAttachImageModel.storageRef)) {
            return true;
        }
        return false;
    }

    public final Uri getImageLink() {
        return this.imageLink;
    }

    public final ImageResponse getImageUploadStatus() {
        return this.imageUploadStatus;
    }

    public final String getImageUploadedURL() {
        return this.imageUploadedURL;
    }

    public final double getProgress() {
        return this.progress;
    }

    public final StorageReference getStorageRef() {
        return this.storageRef;
    }

    public int hashCode() {
        int hashCode;
        long doubleToLongBits = Double.doubleToLongBits(this.progress);
        int i6 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        Uri uri = this.imageLink;
        int i10 = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int hashCode2 = this.imageUploadStatus.hashCode();
        int c10 = a.c(this.imageUploadedURL, (hashCode2 + ((i6 + hashCode) * 31)) * 31, 31);
        StorageReference storageReference = this.storageRef;
        if (storageReference != null) {
            i10 = storageReference.hashCode();
        }
        return c10 + i10;
    }

    public final void setImageUploadStatus(ImageResponse imageResponse) {
        i.g(imageResponse, "<set-?>");
        this.imageUploadStatus = imageResponse;
    }

    public final void setImageUploadedURL(String str) {
        i.g(str, "<set-?>");
        this.imageUploadedURL = str;
    }

    public final void setProgress(double d10) {
        this.progress = d10;
    }

    public final void setStorageRef(StorageReference storageReference) {
        this.storageRef = storageReference;
    }

    public String toString() {
        return "JournalAttachImageModel(progress=" + this.progress + ", imageLink=" + this.imageLink + ", imageUploadStatus=" + this.imageUploadStatus + ", imageUploadedURL=" + this.imageUploadedURL + ", storageRef=" + this.storageRef + ')';
    }

    public /* synthetic */ JournalAttachImageModel(double d10, Uri uri, ImageResponse imageResponse, String str, StorageReference storageReference, int i6, d dVar) {
        this((i6 & 1) != 0 ? 0.0d : d10, (i6 & 2) != 0 ? null : uri, imageResponse, (i6 & 8) != 0 ? "" : str, (i6 & 16) != 0 ? null : storageReference);
    }
}
