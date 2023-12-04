package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
/* compiled from: ShareContentValidation.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u00045678B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001a\u0010\u0011\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001a\u0010\u0012\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001a\u0010\u0013\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001a\u0010\u0014\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u0004H\u0002J \u0010\u001b\u001a\u00020\t2\u000e\u0010\u001c\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001d2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010$\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010%\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010&\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010*\u001a\u00020\t2\u0006\u0010(\u001a\u00020+H\u0002J\u001a\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u001a\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u00102\u001a\u00020\t2\u0006\u00103\u001a\u0002042\u0006\u0010\f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation;", "", "()V", "apiValidator", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "defaultValidator", "storyValidator", "webShareValidator", "validate", "", FirebaseAnalytics.Param.CONTENT, "Lcom/facebook/share/model/ShareContent;", "validator", "validateCameraEffectContent", "cameraEffectContent", "Lcom/facebook/share/model/ShareCameraEffectContent;", "validateForApiShare", "validateForMessage", "validateForNativeShare", "validateForStoryShare", "validateForWebShare", "validateLinkContent", "linkContent", "Lcom/facebook/share/model/ShareLinkContent;", "validateMediaContent", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", "validateMedium", "medium", "Lcom/facebook/share/model/ShareMedia;", "validatePhoto", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/SharePhoto;", "validatePhotoContent", "photoContent", "Lcom/facebook/share/model/SharePhotoContent;", "validatePhotoForApi", "validatePhotoForNativeDialog", "validatePhotoForWebDialog", "validateShareMessengerActionButton", "button", "Lcom/facebook/share/model/ShareMessengerActionButton;", "validateShareMessengerURLActionButton", "Lcom/facebook/share/model/ShareMessengerURLActionButton;", "validateStoryContent", "storyContent", "Lcom/facebook/share/model/ShareStoryContent;", "validateVideo", "video", "Lcom/facebook/share/model/ShareVideo;", "validateVideoContent", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "ApiValidator", "StoryShareValidator", "Validator", "WebShareValidator", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareContentValidation {
    public static final ShareContentValidation INSTANCE = new ShareContentValidation();
    private static final Validator webShareValidator = new WebShareValidator();
    private static final Validator defaultValidator = new Validator();
    private static final Validator apiValidator = new ApiValidator();
    private static final Validator storyValidator = new StoryShareValidator();

    private ShareContentValidation() {
    }

    @JvmStatic
    public static final void validateForMessage(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, defaultValidator);
    }

    @JvmStatic
    public static final void validateForNativeShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, defaultValidator);
    }

    @JvmStatic
    public static final void validateForWebShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, webShareValidator);
    }

    @JvmStatic
    public static final void validateForApiShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, apiValidator);
    }

    @JvmStatic
    public static final void validateForStoryShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, storyValidator);
    }

    private final void validate(ShareContent<?, ?> shareContent, Validator validator) throws FacebookException {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (shareContent instanceof ShareLinkContent) {
            validator.validate((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            validator.validate((SharePhotoContent) shareContent);
        } else if (shareContent instanceof ShareVideoContent) {
            validator.validate((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            validator.validate((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            validator.validate((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            validator.validate((ShareStoryContent) shareContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateStoryContent(ShareStoryContent shareStoryContent, Validator validator) {
        if (shareStoryContent == null || (shareStoryContent.getBackgroundAsset() == null && shareStoryContent.getStickerAsset() == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.getBackgroundAsset() != null) {
            validator.validate(shareStoryContent.getBackgroundAsset());
        }
        if (shareStoryContent.getStickerAsset() != null) {
            validator.validate(shareStoryContent.getStickerAsset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateLinkContent(ShareLinkContent shareLinkContent, Validator validator) {
        Uri contentUrl = shareLinkContent.getContentUrl();
        if (contentUrl != null) {
            Utility utility = Utility.INSTANCE;
            if (!Utility.isWebUri(contentUrl)) {
                throw new FacebookException("Content Url must be an http:// or https:// url");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoContent(SharePhotoContent sharePhotoContent, Validator validator) {
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null || photos.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        }
        if (photos.size() > 6) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
        for (SharePhoto sharePhoto : photos) {
            validator.validate(sharePhoto);
        }
    }

    private final void validatePhoto(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null && imageUrl == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForApi(SharePhoto sharePhoto, Validator validator) {
        validatePhoto(sharePhoto);
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null) {
            Utility utility = Utility.INSTANCE;
            if (Utility.isWebUri(imageUrl)) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForNativeDialog(SharePhoto sharePhoto, Validator validator) {
        validatePhotoForApi(sharePhoto, validator);
        if (sharePhoto.getBitmap() == null) {
            Utility utility = Utility.INSTANCE;
            if (Utility.isWebUri(sharePhoto.getImageUrl())) {
                return;
            }
        }
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Validate.hasContentProvider(FacebookSdk.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForWebDialog(SharePhoto sharePhoto, Validator validator) {
        validatePhoto(sharePhoto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateVideoContent(ShareVideoContent shareVideoContent, Validator validator) {
        validator.validate(shareVideoContent.getVideo());
        SharePhoto previewPhoto = shareVideoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            validator.validate(previewPhoto);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateVideo(ShareVideo shareVideo, Validator validator) {
        if (shareVideo == null) {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
        Uri localUrl = shareVideo.getLocalUrl();
        if (localUrl == null) {
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        Utility utility = Utility.INSTANCE;
        if (Utility.isContentUri(localUrl)) {
            return;
        }
        Utility utility2 = Utility.INSTANCE;
        if (!Utility.isFileUri(localUrl)) {
            throw new FacebookException("ShareVideo must reference a video that is on the device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateMediaContent(ShareMediaContent shareMediaContent, Validator validator) {
        List<ShareMedia<?, ?>> media = shareMediaContent.getMedia();
        if (media == null || media.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        }
        if (media.size() > 6) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
        for (ShareMedia<?, ?> shareMedia : media) {
            validator.validate(shareMedia);
        }
    }

    @JvmStatic
    public static final void validateMedium(ShareMedia<?, ?> medium, Validator validator) {
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(validator, "validator");
        if (medium instanceof SharePhoto) {
            validator.validate((SharePhoto) medium);
        } else if (medium instanceof ShareVideo) {
            validator.validate((ShareVideo) medium);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{medium.getClass().getSimpleName()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateCameraEffectContent(ShareCameraEffectContent shareCameraEffectContent) {
        String effectId = shareCameraEffectContent.getEffectId();
        Utility utility = Utility.INSTANCE;
        if (Utility.isNullOrEmpty(effectId)) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    private final void validateShareMessengerActionButton(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton == null) {
            return;
        }
        Utility utility = Utility.INSTANCE;
        if (Utility.isNullOrEmpty(shareMessengerActionButton.getTitle())) {
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
        if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
            validateShareMessengerURLActionButton((ShareMessengerURLActionButton) shareMessengerActionButton);
        }
    }

    private final void validateShareMessengerURLActionButton(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.getUrl() == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* compiled from: ShareContentValidation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$StoryShareValidator;", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "()V", "validate", "", "storyContent", "Lcom/facebook/share/model/ShareStoryContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class StoryShareValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareStoryContent shareStoryContent) {
            ShareContentValidation.INSTANCE.validateStoryContent(shareStoryContent, this);
        }
    }

    /* compiled from: ShareContentValidation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$WebShareValidator;", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "()V", "validate", "", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/SharePhoto;", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class WebShareValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            ShareContentValidation.INSTANCE.validatePhotoForWebDialog(photo, this);
        }
    }

    /* compiled from: ShareContentValidation.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$ApiValidator;", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "()V", "validate", "", "linkContent", "Lcom/facebook/share/model/ShareLinkContent;", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/SharePhoto;", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class ApiValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            ShareContentValidation.INSTANCE.validatePhotoForApi(photo, this);
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            Utility utility = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(videoContent.getPlaceId())) {
                throw new FacebookException("Cannot share video content with place IDs using the share api");
            }
            Utility utility2 = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(videoContent.getPeopleIds())) {
                throw new FacebookException("Cannot share video content with people IDs using the share api");
            }
            Utility utility3 = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(videoContent.getRef())) {
                throw new FacebookException("Cannot share video content with referrer URL using the share api");
            }
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareLinkContent linkContent) {
            Intrinsics.checkNotNullParameter(linkContent, "linkContent");
            Utility utility = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(linkContent.getQuote())) {
                throw new FacebookException("Cannot share link content with quote using the share api");
            }
        }
    }

    /* compiled from: ShareContentValidation.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$Validator;", "", "()V", "validate", "", "cameraEffectContent", "Lcom/facebook/share/model/ShareCameraEffectContent;", "linkContent", "Lcom/facebook/share/model/ShareLinkContent;", "medium", "Lcom/facebook/share/model/ShareMedia;", "mediaContent", "Lcom/facebook/share/model/ShareMediaContent;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/SharePhoto;", "photoContent", "Lcom/facebook/share/model/SharePhotoContent;", "storyContent", "Lcom/facebook/share/model/ShareStoryContent;", "video", "Lcom/facebook/share/model/ShareVideo;", "videoContent", "Lcom/facebook/share/model/ShareVideoContent;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static class Validator {
        public void validate(ShareLinkContent linkContent) {
            Intrinsics.checkNotNullParameter(linkContent, "linkContent");
            ShareContentValidation.INSTANCE.validateLinkContent(linkContent, this);
        }

        public void validate(SharePhotoContent photoContent) {
            Intrinsics.checkNotNullParameter(photoContent, "photoContent");
            ShareContentValidation.INSTANCE.validatePhotoContent(photoContent, this);
        }

        public void validate(ShareVideoContent videoContent) {
            Intrinsics.checkNotNullParameter(videoContent, "videoContent");
            ShareContentValidation.INSTANCE.validateVideoContent(videoContent, this);
        }

        public void validate(ShareMediaContent mediaContent) {
            Intrinsics.checkNotNullParameter(mediaContent, "mediaContent");
            ShareContentValidation.INSTANCE.validateMediaContent(mediaContent, this);
        }

        public void validate(ShareCameraEffectContent cameraEffectContent) {
            Intrinsics.checkNotNullParameter(cameraEffectContent, "cameraEffectContent");
            ShareContentValidation.INSTANCE.validateCameraEffectContent(cameraEffectContent);
        }

        public void validate(SharePhoto photo) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            ShareContentValidation.INSTANCE.validatePhotoForNativeDialog(photo, this);
        }

        public void validate(ShareVideo shareVideo) {
            ShareContentValidation.INSTANCE.validateVideo(shareVideo, this);
        }

        public void validate(ShareMedia<?, ?> medium) {
            Intrinsics.checkNotNullParameter(medium, "medium");
            ShareContentValidation shareContentValidation = ShareContentValidation.INSTANCE;
            ShareContentValidation.validateMedium(medium, this);
        }

        public void validate(ShareStoryContent shareStoryContent) {
            ShareContentValidation.INSTANCE.validateStoryContent(shareStoryContent, this);
        }
    }
}
