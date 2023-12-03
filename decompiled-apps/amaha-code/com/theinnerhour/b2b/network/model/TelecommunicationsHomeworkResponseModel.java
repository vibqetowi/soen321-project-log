package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: TelecommunicationsHomeworkResponseModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002!\"BA\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel;", "", "homeworkList", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$HomeworkModel;", "Lkotlin/collections/ArrayList;", "totalPage", "", "currPage", "initialAssessment", "verificationStatus", "", "(Ljava/util/ArrayList;IILcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$HomeworkModel;Ljava/lang/String;)V", "getCurrPage", "()I", "getHomeworkList", "()Ljava/util/ArrayList;", "getInitialAssessment", "()Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$HomeworkModel;", "getTotalPage", "getVerificationStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "HomeworkModel", "ToolContent", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class TelecommunicationsHomeworkResponseModel {
    @b("page")
    private final int currPage;
    @b("data")
    private final ArrayList<HomeworkModel> homeworkList;
    @b("initial_assessment")
    private final HomeworkModel initialAssessment;
    @b("total_page")
    private final int totalPage;
    @b("verification_status")
    private final String verificationStatus;

    /* compiled from: TelecommunicationsHomeworkResponseModel.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\u000f\u00103\u001a\b\u0018\u00010\fR\u00020\rHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0019J¬\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001dR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u0012\u0010\u001eR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u0011\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001c\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006<"}, d2 = {"Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$HomeworkModel;", "", "id", "", SessionManager.KEY_NAME, "slug", "status", "type", "assignedId", "isBSETool", "", "toolContent", "Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$ToolContent;", "Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel;", "epochSortKey", "", "epochCompletedAt", "isLogsEnabled", "isCustomJournal", "toolTemplate", "Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTemplateType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$ToolContent;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTemplateType;)V", "getAssignedId", "()Ljava/lang/String;", "getEpochCompletedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEpochSortKey", "getId", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getSlug", "getStatus", "getToolContent", "()Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$ToolContent;", "getToolTemplate", "()Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTemplateType;", "getType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$ToolContent;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/theinnerhour/b2b/network/model/TelecommunicationHomeworkNotificationTemplateType;)Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$HomeworkModel;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class HomeworkModel {
        @b("assigned_id")
        private final String assignedId;
        @b("epoch_completed_at")
        private final Long epochCompletedAt;
        @b("epoch_sort_key")
        private final Long epochSortKey;
        @b("id")

        /* renamed from: id  reason: collision with root package name */
        private final String f11779id;
        @b("is_bse_tool")
        private final boolean isBSETool;
        @b("is_custom_journal")
        private final Boolean isCustomJournal;
        @b("show_logs")
        private final Boolean isLogsEnabled;
        @b(SessionManager.KEY_NAME)
        private final String name;
        @b("slug")
        private final String slug;
        @b("status")
        private final String status;
        @b("tool_type")
        private final ToolContent toolContent;
        @b("tool_template")
        private final TelecommunicationHomeworkNotificationTemplateType toolTemplate;
        @b("type")
        private final String type;

        public HomeworkModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, ToolContent toolContent, Long l2, Long l10, Boolean bool, Boolean bool2, TelecommunicationHomeworkNotificationTemplateType telecommunicationHomeworkNotificationTemplateType) {
            this.f11779id = str;
            this.name = str2;
            this.slug = str3;
            this.status = str4;
            this.type = str5;
            this.assignedId = str6;
            this.isBSETool = z10;
            this.toolContent = toolContent;
            this.epochSortKey = l2;
            this.epochCompletedAt = l10;
            this.isLogsEnabled = bool;
            this.isCustomJournal = bool2;
            this.toolTemplate = telecommunicationHomeworkNotificationTemplateType;
        }

        public final String component1() {
            return this.f11779id;
        }

        public final Long component10() {
            return this.epochCompletedAt;
        }

        public final Boolean component11() {
            return this.isLogsEnabled;
        }

        public final Boolean component12() {
            return this.isCustomJournal;
        }

        public final TelecommunicationHomeworkNotificationTemplateType component13() {
            return this.toolTemplate;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.slug;
        }

        public final String component4() {
            return this.status;
        }

        public final String component5() {
            return this.type;
        }

        public final String component6() {
            return this.assignedId;
        }

        public final boolean component7() {
            return this.isBSETool;
        }

        public final ToolContent component8() {
            return this.toolContent;
        }

        public final Long component9() {
            return this.epochSortKey;
        }

        public final HomeworkModel copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, ToolContent toolContent, Long l2, Long l10, Boolean bool, Boolean bool2, TelecommunicationHomeworkNotificationTemplateType telecommunicationHomeworkNotificationTemplateType) {
            return new HomeworkModel(str, str2, str3, str4, str5, str6, z10, toolContent, l2, l10, bool, bool2, telecommunicationHomeworkNotificationTemplateType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeworkModel)) {
                return false;
            }
            HomeworkModel homeworkModel = (HomeworkModel) obj;
            if (i.b(this.f11779id, homeworkModel.f11779id) && i.b(this.name, homeworkModel.name) && i.b(this.slug, homeworkModel.slug) && i.b(this.status, homeworkModel.status) && i.b(this.type, homeworkModel.type) && i.b(this.assignedId, homeworkModel.assignedId) && this.isBSETool == homeworkModel.isBSETool && i.b(this.toolContent, homeworkModel.toolContent) && i.b(this.epochSortKey, homeworkModel.epochSortKey) && i.b(this.epochCompletedAt, homeworkModel.epochCompletedAt) && i.b(this.isLogsEnabled, homeworkModel.isLogsEnabled) && i.b(this.isCustomJournal, homeworkModel.isCustomJournal) && i.b(this.toolTemplate, homeworkModel.toolTemplate)) {
                return true;
            }
            return false;
        }

        public final String getAssignedId() {
            return this.assignedId;
        }

        public final Long getEpochCompletedAt() {
            return this.epochCompletedAt;
        }

        public final Long getEpochSortKey() {
            return this.epochSortKey;
        }

        public final String getId() {
            return this.f11779id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getStatus() {
            return this.status;
        }

        public final ToolContent getToolContent() {
            return this.toolContent;
        }

        public final TelecommunicationHomeworkNotificationTemplateType getToolTemplate() {
            return this.toolTemplate;
        }

        public final String getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int hashCode11;
            String str = this.f11779id;
            int i6 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = hashCode * 31;
            String str2 = this.name;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i11 = (i10 + hashCode2) * 31;
            String str3 = this.slug;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i12 = (i11 + hashCode3) * 31;
            String str4 = this.status;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i13 = (i12 + hashCode4) * 31;
            String str5 = this.type;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i14 = (i13 + hashCode5) * 31;
            String str6 = this.assignedId;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i15 = (i14 + hashCode6) * 31;
            boolean z10 = this.isBSETool;
            int i16 = z10;
            if (z10 != 0) {
                i16 = 1;
            }
            int i17 = (i15 + i16) * 31;
            ToolContent toolContent = this.toolContent;
            if (toolContent == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = toolContent.hashCode();
            }
            int i18 = (i17 + hashCode7) * 31;
            Long l2 = this.epochSortKey;
            if (l2 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = l2.hashCode();
            }
            int i19 = (i18 + hashCode8) * 31;
            Long l10 = this.epochCompletedAt;
            if (l10 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = l10.hashCode();
            }
            int i20 = (i19 + hashCode9) * 31;
            Boolean bool = this.isLogsEnabled;
            if (bool == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = bool.hashCode();
            }
            int i21 = (i20 + hashCode10) * 31;
            Boolean bool2 = this.isCustomJournal;
            if (bool2 == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = bool2.hashCode();
            }
            int i22 = (i21 + hashCode11) * 31;
            TelecommunicationHomeworkNotificationTemplateType telecommunicationHomeworkNotificationTemplateType = this.toolTemplate;
            if (telecommunicationHomeworkNotificationTemplateType != null) {
                i6 = telecommunicationHomeworkNotificationTemplateType.hashCode();
            }
            return i22 + i6;
        }

        public final boolean isBSETool() {
            return this.isBSETool;
        }

        public final Boolean isCustomJournal() {
            return this.isCustomJournal;
        }

        public final Boolean isLogsEnabled() {
            return this.isLogsEnabled;
        }

        public String toString() {
            return "HomeworkModel(id=" + this.f11779id + ", name=" + this.name + ", slug=" + this.slug + ", status=" + this.status + ", type=" + this.type + ", assignedId=" + this.assignedId + ", isBSETool=" + this.isBSETool + ", toolContent=" + this.toolContent + ", epochSortKey=" + this.epochSortKey + ", epochCompletedAt=" + this.epochCompletedAt + ", isLogsEnabled=" + this.isLogsEnabled + ", isCustomJournal=" + this.isCustomJournal + ", toolTemplate=" + this.toolTemplate + ')';
        }
    }

    /* compiled from: TelecommunicationsHomeworkResponseModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel$ToolContent;", "", "id", "", SessionManager.KEY_NAME, "", "color", "toolAsset", "(Lcom/theinnerhour/b2b/network/model/TelecommunicationsHomeworkResponseModel;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getToolAsset", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public final class ToolContent {
        @b("color_code")
        private final String color;
        @b("id")

        /* renamed from: id  reason: collision with root package name */
        private final Integer f11780id;
        @b(SessionManager.KEY_NAME)
        private final String name;
        @b("tool_icon")
        private final String toolAsset;

        public ToolContent(Integer num, String str, String str2, String str3) {
            this.f11780id = num;
            this.name = str;
            this.color = str2;
            this.toolAsset = str3;
        }

        public final String getColor() {
            return this.color;
        }

        public final Integer getId() {
            return this.f11780id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getToolAsset() {
            return this.toolAsset;
        }
    }

    public TelecommunicationsHomeworkResponseModel(ArrayList<HomeworkModel> homeworkList, int i6, int i10, HomeworkModel homeworkModel, String str) {
        i.g(homeworkList, "homeworkList");
        this.homeworkList = homeworkList;
        this.totalPage = i6;
        this.currPage = i10;
        this.initialAssessment = homeworkModel;
        this.verificationStatus = str;
    }

    public static /* synthetic */ TelecommunicationsHomeworkResponseModel copy$default(TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel, ArrayList arrayList, int i6, int i10, HomeworkModel homeworkModel, String str, int i11, Object obj) {
        ArrayList<HomeworkModel> arrayList2 = arrayList;
        if ((i11 & 1) != 0) {
            arrayList2 = telecommunicationsHomeworkResponseModel.homeworkList;
        }
        if ((i11 & 2) != 0) {
            i6 = telecommunicationsHomeworkResponseModel.totalPage;
        }
        int i12 = i6;
        if ((i11 & 4) != 0) {
            i10 = telecommunicationsHomeworkResponseModel.currPage;
        }
        int i13 = i10;
        if ((i11 & 8) != 0) {
            homeworkModel = telecommunicationsHomeworkResponseModel.initialAssessment;
        }
        HomeworkModel homeworkModel2 = homeworkModel;
        if ((i11 & 16) != 0) {
            str = telecommunicationsHomeworkResponseModel.verificationStatus;
        }
        return telecommunicationsHomeworkResponseModel.copy(arrayList2, i12, i13, homeworkModel2, str);
    }

    public final ArrayList<HomeworkModel> component1() {
        return this.homeworkList;
    }

    public final int component2() {
        return this.totalPage;
    }

    public final int component3() {
        return this.currPage;
    }

    public final HomeworkModel component4() {
        return this.initialAssessment;
    }

    public final String component5() {
        return this.verificationStatus;
    }

    public final TelecommunicationsHomeworkResponseModel copy(ArrayList<HomeworkModel> homeworkList, int i6, int i10, HomeworkModel homeworkModel, String str) {
        i.g(homeworkList, "homeworkList");
        return new TelecommunicationsHomeworkResponseModel(homeworkList, i6, i10, homeworkModel, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelecommunicationsHomeworkResponseModel)) {
            return false;
        }
        TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel = (TelecommunicationsHomeworkResponseModel) obj;
        if (i.b(this.homeworkList, telecommunicationsHomeworkResponseModel.homeworkList) && this.totalPage == telecommunicationsHomeworkResponseModel.totalPage && this.currPage == telecommunicationsHomeworkResponseModel.currPage && i.b(this.initialAssessment, telecommunicationsHomeworkResponseModel.initialAssessment) && i.b(this.verificationStatus, telecommunicationsHomeworkResponseModel.verificationStatus)) {
            return true;
        }
        return false;
    }

    public final int getCurrPage() {
        return this.currPage;
    }

    public final ArrayList<HomeworkModel> getHomeworkList() {
        return this.homeworkList;
    }

    public final HomeworkModel getInitialAssessment() {
        return this.initialAssessment;
    }

    public final int getTotalPage() {
        return this.totalPage;
    }

    public final String getVerificationStatus() {
        return this.verificationStatus;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.homeworkList.hashCode() * 31) + this.totalPage) * 31) + this.currPage) * 31;
        HomeworkModel homeworkModel = this.initialAssessment;
        int i6 = 0;
        if (homeworkModel == null) {
            hashCode = 0;
        } else {
            hashCode = homeworkModel.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        String str = this.verificationStatus;
        if (str != null) {
            i6 = str.hashCode();
        }
        return i10 + i6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TelecommunicationsHomeworkResponseModel(homeworkList=");
        sb2.append(this.homeworkList);
        sb2.append(", totalPage=");
        sb2.append(this.totalPage);
        sb2.append(", currPage=");
        sb2.append(this.currPage);
        sb2.append(", initialAssessment=");
        sb2.append(this.initialAssessment);
        sb2.append(", verificationStatus=");
        return g.c(sb2, this.verificationStatus, ')');
    }
}
