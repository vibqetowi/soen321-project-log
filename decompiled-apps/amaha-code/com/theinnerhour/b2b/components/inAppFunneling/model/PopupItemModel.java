package com.theinnerhour.b2b.components.inAppFunneling.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: PopupItemModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel;", "", "rank", "", "(I)V", "getRank", "()I", "BookDropOff", "DashboardPopup", "MatchingDropOff", "NpsDayFive", "ProfileViewDropOff", "VideoClickDropOff", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$BookDropOff;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$DashboardPopup;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$MatchingDropOff;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$NpsDayFive;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$ProfileViewDropOff;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$VideoClickDropOff;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public abstract class PopupItemModel {
    private final int rank;

    /* compiled from: PopupItemModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$BookDropOff;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel;", "status", "", "providerData", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "(Ljava/lang/String;Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;)V", "getProviderData", "()Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "getStatus", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class BookDropOff extends PopupItemModel {
        private final InAppPromptData providerData;
        private final String status;

        public BookDropOff(String str, InAppPromptData inAppPromptData) {
            super(3, null);
            this.status = str;
            this.providerData = inAppPromptData;
        }

        public final InAppPromptData getProviderData() {
            return this.providerData;
        }

        public final String getStatus() {
            return this.status;
        }
    }

    /* compiled from: PopupItemModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$DashboardPopup;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel;", "slug", "", "rank", "", "(Ljava/lang/String;I)V", "getSlug", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class DashboardPopup extends PopupItemModel {
        private final String slug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DashboardPopup(String slug, int i6) {
            super(i6, null);
            i.g(slug, "slug");
            this.slug = slug;
        }

        public final String getSlug() {
            return this.slug;
        }
    }

    /* compiled from: PopupItemModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$MatchingDropOff;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel;", "status", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getStatus", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class MatchingDropOff extends PopupItemModel {
        private final String reason;
        private final String status;

        public MatchingDropOff(String str, String str2) {
            super(3, null);
            this.status = str;
            this.reason = str2;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getStatus() {
            return this.status;
        }
    }

    /* compiled from: PopupItemModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$NpsDayFive;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel;", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class NpsDayFive extends PopupItemModel {
        public NpsDayFive() {
            super(4, null);
        }
    }

    /* compiled from: PopupItemModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$ProfileViewDropOff;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel;", "status", "", "providerData", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "(Ljava/lang/String;Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;)V", "getProviderData", "()Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "getStatus", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class ProfileViewDropOff extends PopupItemModel {
        private final InAppPromptData providerData;
        private final String status;

        public ProfileViewDropOff(String str, InAppPromptData inAppPromptData) {
            super(3, null);
            this.status = str;
            this.providerData = inAppPromptData;
        }

        public final InAppPromptData getProviderData() {
            return this.providerData;
        }

        public final String getStatus() {
            return this.status;
        }
    }

    /* compiled from: PopupItemModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel$VideoClickDropOff;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/PopupItemModel;", "status", "", "providerData", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "(Ljava/lang/String;Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;)V", "getProviderData", "()Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "getStatus", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class VideoClickDropOff extends PopupItemModel {
        private final InAppPromptData providerData;
        private final String status;

        public VideoClickDropOff(String str, InAppPromptData inAppPromptData) {
            super(3, null);
            this.status = str;
            this.providerData = inAppPromptData;
        }

        public final InAppPromptData getProviderData() {
            return this.providerData;
        }

        public final String getStatus() {
            return this.status;
        }
    }

    public /* synthetic */ PopupItemModel(int i6, d dVar) {
        this(i6);
    }

    public final int getRank() {
        return this.rank;
    }

    private PopupItemModel(int i6) {
        this.rank = i6;
    }
}
