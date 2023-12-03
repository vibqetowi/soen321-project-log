package com.theinnerhour.b2b.components.profile.experiment.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: ProfileAssetModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a\u001a\u0012\b\u0012\u00060\u0005R\u00020\u00000\u0004j\f\u0012\b\u0012\u00060\u0005R\u00020\u0000`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR2\u0010\u000b\u001a\u001a\u0012\b\u0012\u00060\fR\u00020\u00000\u0004j\f\u0012\b\u0012\u00060\fR\u00020\u0000`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/components/profile/experiment/model/ProfileAssetModel;", "", "()V", "avatars", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/profile/experiment/model/ProfileAssetModel$ProfileAvatarAsset;", "Lkotlin/collections/ArrayList;", "getAvatars", "()Ljava/util/ArrayList;", "setAvatars", "(Ljava/util/ArrayList;)V", "themes", "Lcom/theinnerhour/b2b/components/profile/experiment/model/ProfileAssetModel$ProfileThemeAsset;", "getThemes", "setThemes", "ProfileAvatarAsset", "ProfileThemeAsset", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProfileAssetModel {
    private ArrayList<ProfileThemeAsset> themes = new ArrayList<>();
    private ArrayList<ProfileAvatarAsset> avatars = new ArrayList<>();

    /* compiled from: ProfileAssetModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/components/profile/experiment/model/ProfileAssetModel$ProfileAvatarAsset;", "", "(Lcom/theinnerhour/b2b/components/profile/experiment/model/ProfileAssetModel;)V", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "default", "", "getDefault", "()Z", "setDefault", "(Z)V", "selected", "getSelected", "setSelected", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class ProfileAvatarAsset {
        private String avatar;

        /* renamed from: default  reason: not valid java name */
        private boolean f0default;
        private boolean selected;

        public ProfileAvatarAsset() {
        }

        public final String getAvatar() {
            return this.avatar;
        }

        public final boolean getDefault() {
            return this.f0default;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final void setAvatar(String str) {
            this.avatar = str;
        }

        public final void setDefault(boolean z10) {
            this.f0default = z10;
        }

        public final void setSelected(boolean z10) {
            this.selected = z10;
        }
    }

    /* compiled from: ProfileAssetModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/components/profile/experiment/model/ProfileAssetModel$ProfileThemeAsset;", "", "(Lcom/theinnerhour/b2b/components/profile/experiment/model/ProfileAssetModel;)V", "coverImage", "", "getCoverImage", "()Ljava/lang/String;", "setCoverImage", "(Ljava/lang/String;)V", "default", "", "getDefault", "()Z", "setDefault", "(Z)V", "selected", "getSelected", "setSelected", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class ProfileThemeAsset {
        @b("cover_image")
        private String coverImage;

        /* renamed from: default  reason: not valid java name */
        private boolean f1default;
        private boolean selected;

        public ProfileThemeAsset() {
        }

        public final String getCoverImage() {
            return this.coverImage;
        }

        public final boolean getDefault() {
            return this.f1default;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final void setCoverImage(String str) {
            this.coverImage = str;
        }

        public final void setDefault(boolean z10) {
            this.f1default = z10;
        }

        public final void setSelected(boolean z10) {
            this.selected = z10;
        }
    }

    public final ArrayList<ProfileAvatarAsset> getAvatars() {
        return this.avatars;
    }

    public final ArrayList<ProfileThemeAsset> getThemes() {
        return this.themes;
    }

    public final void setAvatars(ArrayList<ProfileAvatarAsset> arrayList) {
        i.g(arrayList, "<set-?>");
        this.avatars = arrayList;
    }

    public final void setThemes(ArrayList<ProfileThemeAsset> arrayList) {
        i.g(arrayList, "<set-?>");
        this.themes = arrayList;
    }
}
