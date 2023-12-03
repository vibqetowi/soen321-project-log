package com.theinnerhour.b2b.components.recommendedActivities.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import fe.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: RecommendedActivityContentModel.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0010\u0012\u001c\b\u0002\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\f¢\u0006\u0004\bv\u0010wJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001d\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\fHÆ\u0003JÃ\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010(\u001a\u00020\u00102\u001c\b\u0002\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\fHÆ\u0001J\t\u00105\u001a\u00020\u0002HÖ\u0001J\t\u00106\u001a\u00020\u0010HÖ\u0001J\u0013\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003J\t\u0010;\u001a\u00020\u0010HÖ\u0001J\u0019\u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0010HÖ\u0001R\"\u0010\u001e\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010A\u001a\u0004\bF\u0010C\"\u0004\bG\u0010ER$\u0010 \u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER$\u0010!\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010A\u001a\u0004\bL\u0010C\"\u0004\bM\u0010ER$\u0010#\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010A\u001a\u0004\bN\u0010C\"\u0004\bO\u0010ER$\u0010$\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010A\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010A\u001a\u0004\bW\u0010C\"\u0004\bX\u0010ER$\u0010'\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010A\u001a\u0004\bY\u0010C\"\u0004\bZ\u0010ER\"\u0010(\u001a\u00020\u00108\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R6\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010R\u001a\u0004\b`\u0010T\"\u0004\ba\u0010VR$\u0010*\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010A\u001a\u0004\bb\u0010C\"\u0004\bc\u0010ER$\u0010+\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010A\u001a\u0004\bd\u0010C\"\u0004\be\u0010ER$\u0010,\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010A\u001a\u0004\bf\u0010C\"\u0004\bg\u0010ER$\u0010-\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010A\u001a\u0004\bh\u0010C\"\u0004\bi\u0010ER$\u0010.\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010A\u001a\u0004\bj\u0010C\"\u0004\bk\u0010ER$\u0010/\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010A\u001a\u0004\bl\u0010C\"\u0004\bm\u0010ER$\u00100\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010A\u001a\u0004\bn\u0010C\"\u0004\bo\u0010ER$\u00101\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010A\u001a\u0004\bp\u0010C\"\u0004\bq\u0010ER$\u00102\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010A\u001a\u0004\br\u0010C\"\u0004\bs\u0010ER6\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\f8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010R\u001a\u0004\bt\u0010T\"\u0004\bu\u0010V¨\u0006x"}, d2 = {"Lcom/theinnerhour/b2b/components/recommendedActivities/model/RecommendedActivityContentModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/recommendedActivities/model/RecommendedActivityHintListModel;", "Lkotlin/collections/ArrayList;", "component8", "component9", "component10", "", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "Lcom/theinnerhour/b2b/components/recommendedActivities/model/RecommendedPhysicalActivityGifTips;", "component22", "label", "title", "ctaGoalAdd", "ctaGoalAdded", "ctaGoalTrack", "ctaDone", "tipsDescription", "tipsIconsList", "tipsTitle", "duration", "loops", "tipsContent", "stopDialogText", "stopDialogPositiveCta", "stopDialogNegativeCta", "goalAddedToast", "downloadProgressToast", "downloadCompleteToast", "downloadFailedToast", "audioFailedToast", "gifFailedToast", "gifTipsList", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lhs/k;", "writeToParcel", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getCtaGoalAdd", "setCtaGoalAdd", "getCtaGoalAdded", "setCtaGoalAdded", "getCtaGoalTrack", "setCtaGoalTrack", "getCtaDone", "setCtaDone", "getTipsDescription", "setTipsDescription", "Ljava/util/ArrayList;", "getTipsIconsList", "()Ljava/util/ArrayList;", "setTipsIconsList", "(Ljava/util/ArrayList;)V", "getTipsTitle", "setTipsTitle", "getDuration", "setDuration", "I", "getLoops", "()I", "setLoops", "(I)V", "getTipsContent", "setTipsContent", "getStopDialogText", "setStopDialogText", "getStopDialogPositiveCta", "setStopDialogPositiveCta", "getStopDialogNegativeCta", "setStopDialogNegativeCta", "getGoalAddedToast", "setGoalAddedToast", "getDownloadProgressToast", "setDownloadProgressToast", "getDownloadCompleteToast", "setDownloadCompleteToast", "getDownloadFailedToast", "setDownloadFailedToast", "getAudioFailedToast", "setAudioFailedToast", "getGifFailedToast", "setGifFailedToast", "getGifTipsList", "setGifTipsList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RecommendedActivityContentModel implements Parcelable {
    public static final Parcelable.Creator<RecommendedActivityContentModel> CREATOR = new Creator();
    private String audioFailedToast;
    private String ctaDone;
    private String ctaGoalAdd;
    private String ctaGoalAdded;
    private String ctaGoalTrack;
    private String downloadCompleteToast;
    private String downloadFailedToast;
    private String downloadProgressToast;
    private String duration;
    private String gifFailedToast;
    private ArrayList<RecommendedPhysicalActivityGifTips> gifTipsList;
    private String goalAddedToast;
    private String label;
    private int loops;
    private String stopDialogNegativeCta;
    private String stopDialogPositiveCta;
    private String stopDialogText;
    private ArrayList<RecommendedActivityHintListModel> tipsContent;
    private String tipsDescription;
    private ArrayList<RecommendedActivityHintListModel> tipsIconsList;
    private String tipsTitle;
    private String title;

    /* compiled from: RecommendedActivityContentModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<RecommendedActivityContentModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedActivityContentModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            ArrayList arrayList3;
            i.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i6 = 0; i6 != readInt; i6++) {
                    arrayList.add(RecommendedActivityHintListModel.CREATOR.createFromParcel(parcel));
                }
            }
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                for (int i10 = 0; i10 != readInt3; i10++) {
                    arrayList4.add(RecommendedActivityHintListModel.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList4;
            }
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = readString10;
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                str = readString10;
                int i11 = 0;
                while (i11 != readInt4) {
                    arrayList5.add(RecommendedPhysicalActivityGifTips.CREATOR.createFromParcel(parcel));
                    i11++;
                    readInt4 = readInt4;
                }
                arrayList3 = arrayList5;
            }
            return new RecommendedActivityContentModel(readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, readString8, readString9, readInt2, arrayList2, str, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedActivityContentModel[] newArray(int i6) {
            return new RecommendedActivityContentModel[i6];
        }
    }

    public RecommendedActivityContentModel() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public final String component1() {
        return this.label;
    }

    public final String component10() {
        return this.duration;
    }

    public final int component11() {
        return this.loops;
    }

    public final ArrayList<RecommendedActivityHintListModel> component12() {
        return this.tipsContent;
    }

    public final String component13() {
        return this.stopDialogText;
    }

    public final String component14() {
        return this.stopDialogPositiveCta;
    }

    public final String component15() {
        return this.stopDialogNegativeCta;
    }

    public final String component16() {
        return this.goalAddedToast;
    }

    public final String component17() {
        return this.downloadProgressToast;
    }

    public final String component18() {
        return this.downloadCompleteToast;
    }

    public final String component19() {
        return this.downloadFailedToast;
    }

    public final String component2() {
        return this.title;
    }

    public final String component20() {
        return this.audioFailedToast;
    }

    public final String component21() {
        return this.gifFailedToast;
    }

    public final ArrayList<RecommendedPhysicalActivityGifTips> component22() {
        return this.gifTipsList;
    }

    public final String component3() {
        return this.ctaGoalAdd;
    }

    public final String component4() {
        return this.ctaGoalAdded;
    }

    public final String component5() {
        return this.ctaGoalTrack;
    }

    public final String component6() {
        return this.ctaDone;
    }

    public final String component7() {
        return this.tipsDescription;
    }

    public final ArrayList<RecommendedActivityHintListModel> component8() {
        return this.tipsIconsList;
    }

    public final String component9() {
        return this.tipsTitle;
    }

    public final RecommendedActivityContentModel copy(String label, String str, String str2, String str3, String str4, String str5, String str6, ArrayList<RecommendedActivityHintListModel> arrayList, String str7, String str8, int i6, ArrayList<RecommendedActivityHintListModel> arrayList2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ArrayList<RecommendedPhysicalActivityGifTips> arrayList3) {
        i.g(label, "label");
        return new RecommendedActivityContentModel(label, str, str2, str3, str4, str5, str6, arrayList, str7, str8, i6, arrayList2, str9, str10, str11, str12, str13, str14, str15, str16, str17, arrayList3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedActivityContentModel)) {
            return false;
        }
        RecommendedActivityContentModel recommendedActivityContentModel = (RecommendedActivityContentModel) obj;
        if (i.b(this.label, recommendedActivityContentModel.label) && i.b(this.title, recommendedActivityContentModel.title) && i.b(this.ctaGoalAdd, recommendedActivityContentModel.ctaGoalAdd) && i.b(this.ctaGoalAdded, recommendedActivityContentModel.ctaGoalAdded) && i.b(this.ctaGoalTrack, recommendedActivityContentModel.ctaGoalTrack) && i.b(this.ctaDone, recommendedActivityContentModel.ctaDone) && i.b(this.tipsDescription, recommendedActivityContentModel.tipsDescription) && i.b(this.tipsIconsList, recommendedActivityContentModel.tipsIconsList) && i.b(this.tipsTitle, recommendedActivityContentModel.tipsTitle) && i.b(this.duration, recommendedActivityContentModel.duration) && this.loops == recommendedActivityContentModel.loops && i.b(this.tipsContent, recommendedActivityContentModel.tipsContent) && i.b(this.stopDialogText, recommendedActivityContentModel.stopDialogText) && i.b(this.stopDialogPositiveCta, recommendedActivityContentModel.stopDialogPositiveCta) && i.b(this.stopDialogNegativeCta, recommendedActivityContentModel.stopDialogNegativeCta) && i.b(this.goalAddedToast, recommendedActivityContentModel.goalAddedToast) && i.b(this.downloadProgressToast, recommendedActivityContentModel.downloadProgressToast) && i.b(this.downloadCompleteToast, recommendedActivityContentModel.downloadCompleteToast) && i.b(this.downloadFailedToast, recommendedActivityContentModel.downloadFailedToast) && i.b(this.audioFailedToast, recommendedActivityContentModel.audioFailedToast) && i.b(this.gifFailedToast, recommendedActivityContentModel.gifFailedToast) && i.b(this.gifTipsList, recommendedActivityContentModel.gifTipsList)) {
            return true;
        }
        return false;
    }

    @p("audio_failed_toast")
    public final String getAudioFailedToast() {
        return this.audioFailedToast;
    }

    @p("cta_done")
    public final String getCtaDone() {
        return this.ctaDone;
    }

    @p("cta_goal_add")
    public final String getCtaGoalAdd() {
        return this.ctaGoalAdd;
    }

    @p("cta_goal_added")
    public final String getCtaGoalAdded() {
        return this.ctaGoalAdded;
    }

    @p("cta_goal_track")
    public final String getCtaGoalTrack() {
        return this.ctaGoalTrack;
    }

    @p("download_complete_toast")
    public final String getDownloadCompleteToast() {
        return this.downloadCompleteToast;
    }

    @p("download_failed_toast")
    public final String getDownloadFailedToast() {
        return this.downloadFailedToast;
    }

    @p("download_progress_toast")
    public final String getDownloadProgressToast() {
        return this.downloadProgressToast;
    }

    @p("duration")
    public final String getDuration() {
        return this.duration;
    }

    @p("gif_failed_toast")
    public final String getGifFailedToast() {
        return this.gifFailedToast;
    }

    @p("gif_tips")
    public final ArrayList<RecommendedPhysicalActivityGifTips> getGifTipsList() {
        return this.gifTipsList;
    }

    @p("goal_added_toast")
    public final String getGoalAddedToast() {
        return this.goalAddedToast;
    }

    @p("label")
    public final String getLabel() {
        return this.label;
    }

    @p("no_of_loops")
    public final int getLoops() {
        return this.loops;
    }

    @p("stop_dialog_negative_cta")
    public final String getStopDialogNegativeCta() {
        return this.stopDialogNegativeCta;
    }

    @p("stop_dialog_positive_cta")
    public final String getStopDialogPositiveCta() {
        return this.stopDialogPositiveCta;
    }

    @p("stop_dialog_text")
    public final String getStopDialogText() {
        return this.stopDialogText;
    }

    @p("tips_content")
    public final ArrayList<RecommendedActivityHintListModel> getTipsContent() {
        return this.tipsContent;
    }

    @p("tips_description")
    public final String getTipsDescription() {
        return this.tipsDescription;
    }

    @p("tips_icons_url")
    public final ArrayList<RecommendedActivityHintListModel> getTipsIconsList() {
        return this.tipsIconsList;
    }

    @p("tips_title")
    public final String getTipsTitle() {
        return this.tipsTitle;
    }

    @p("title")
    public final String getTitle() {
        return this.title;
    }

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
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20 = this.label.hashCode() * 31;
        String str = this.title;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode20 + hashCode) * 31;
        String str2 = this.ctaGoalAdd;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.ctaGoalAdded;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.ctaGoalTrack;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.ctaDone;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str6 = this.tipsDescription;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        ArrayList<RecommendedActivityHintListModel> arrayList = this.tipsIconsList;
        if (arrayList == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = arrayList.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.tipsTitle;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        String str8 = this.duration;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i18 = (((i17 + hashCode9) * 31) + this.loops) * 31;
        ArrayList<RecommendedActivityHintListModel> arrayList2 = this.tipsContent;
        if (arrayList2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = arrayList2.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        String str9 = this.stopDialogText;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        String str10 = this.stopDialogPositiveCta;
        if (str10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str10.hashCode();
        }
        int i21 = (i20 + hashCode12) * 31;
        String str11 = this.stopDialogNegativeCta;
        if (str11 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str11.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        String str12 = this.goalAddedToast;
        if (str12 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str12.hashCode();
        }
        int i23 = (i22 + hashCode14) * 31;
        String str13 = this.downloadProgressToast;
        if (str13 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str13.hashCode();
        }
        int i24 = (i23 + hashCode15) * 31;
        String str14 = this.downloadCompleteToast;
        if (str14 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str14.hashCode();
        }
        int i25 = (i24 + hashCode16) * 31;
        String str15 = this.downloadFailedToast;
        if (str15 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str15.hashCode();
        }
        int i26 = (i25 + hashCode17) * 31;
        String str16 = this.audioFailedToast;
        if (str16 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str16.hashCode();
        }
        int i27 = (i26 + hashCode18) * 31;
        String str17 = this.gifFailedToast;
        if (str17 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str17.hashCode();
        }
        int i28 = (i27 + hashCode19) * 31;
        ArrayList<RecommendedPhysicalActivityGifTips> arrayList3 = this.gifTipsList;
        if (arrayList3 != null) {
            i6 = arrayList3.hashCode();
        }
        return i28 + i6;
    }

    @p("audio_failed_toast")
    public final void setAudioFailedToast(String str) {
        this.audioFailedToast = str;
    }

    @p("cta_done")
    public final void setCtaDone(String str) {
        this.ctaDone = str;
    }

    @p("cta_goal_add")
    public final void setCtaGoalAdd(String str) {
        this.ctaGoalAdd = str;
    }

    @p("cta_goal_added")
    public final void setCtaGoalAdded(String str) {
        this.ctaGoalAdded = str;
    }

    @p("cta_goal_track")
    public final void setCtaGoalTrack(String str) {
        this.ctaGoalTrack = str;
    }

    @p("download_complete_toast")
    public final void setDownloadCompleteToast(String str) {
        this.downloadCompleteToast = str;
    }

    @p("download_failed_toast")
    public final void setDownloadFailedToast(String str) {
        this.downloadFailedToast = str;
    }

    @p("download_progress_toast")
    public final void setDownloadProgressToast(String str) {
        this.downloadProgressToast = str;
    }

    @p("duration")
    public final void setDuration(String str) {
        this.duration = str;
    }

    @p("gif_failed_toast")
    public final void setGifFailedToast(String str) {
        this.gifFailedToast = str;
    }

    @p("gif_tips")
    public final void setGifTipsList(ArrayList<RecommendedPhysicalActivityGifTips> arrayList) {
        this.gifTipsList = arrayList;
    }

    @p("goal_added_toast")
    public final void setGoalAddedToast(String str) {
        this.goalAddedToast = str;
    }

    @p("label")
    public final void setLabel(String str) {
        i.g(str, "<set-?>");
        this.label = str;
    }

    @p("no_of_loops")
    public final void setLoops(int i6) {
        this.loops = i6;
    }

    @p("stop_dialog_negative_cta")
    public final void setStopDialogNegativeCta(String str) {
        this.stopDialogNegativeCta = str;
    }

    @p("stop_dialog_positive_cta")
    public final void setStopDialogPositiveCta(String str) {
        this.stopDialogPositiveCta = str;
    }

    @p("stop_dialog_text")
    public final void setStopDialogText(String str) {
        this.stopDialogText = str;
    }

    @p("tips_content")
    public final void setTipsContent(ArrayList<RecommendedActivityHintListModel> arrayList) {
        this.tipsContent = arrayList;
    }

    @p("tips_description")
    public final void setTipsDescription(String str) {
        this.tipsDescription = str;
    }

    @p("tips_icons_url")
    public final void setTipsIconsList(ArrayList<RecommendedActivityHintListModel> arrayList) {
        this.tipsIconsList = arrayList;
    }

    @p("tips_title")
    public final void setTipsTitle(String str) {
        this.tipsTitle = str;
    }

    @p("title")
    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "RecommendedActivityContentModel(label=" + this.label + ", title=" + this.title + ", ctaGoalAdd=" + this.ctaGoalAdd + ", ctaGoalAdded=" + this.ctaGoalAdded + ", ctaGoalTrack=" + this.ctaGoalTrack + ", ctaDone=" + this.ctaDone + ", tipsDescription=" + this.tipsDescription + ", tipsIconsList=" + this.tipsIconsList + ", tipsTitle=" + this.tipsTitle + ", duration=" + this.duration + ", loops=" + this.loops + ", tipsContent=" + this.tipsContent + ", stopDialogText=" + this.stopDialogText + ", stopDialogPositiveCta=" + this.stopDialogPositiveCta + ", stopDialogNegativeCta=" + this.stopDialogNegativeCta + ", goalAddedToast=" + this.goalAddedToast + ", downloadProgressToast=" + this.downloadProgressToast + ", downloadCompleteToast=" + this.downloadCompleteToast + ", downloadFailedToast=" + this.downloadFailedToast + ", audioFailedToast=" + this.audioFailedToast + ", gifFailedToast=" + this.gifFailedToast + ", gifTipsList=" + this.gifTipsList + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i6) {
        i.g(out, "out");
        out.writeString(this.label);
        out.writeString(this.title);
        out.writeString(this.ctaGoalAdd);
        out.writeString(this.ctaGoalAdded);
        out.writeString(this.ctaGoalTrack);
        out.writeString(this.ctaDone);
        out.writeString(this.tipsDescription);
        ArrayList<RecommendedActivityHintListModel> arrayList = this.tipsIconsList;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<RecommendedActivityHintListModel> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i6);
            }
        }
        out.writeString(this.tipsTitle);
        out.writeString(this.duration);
        out.writeInt(this.loops);
        ArrayList<RecommendedActivityHintListModel> arrayList2 = this.tipsContent;
        if (arrayList2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList2.size());
            Iterator<RecommendedActivityHintListModel> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(out, i6);
            }
        }
        out.writeString(this.stopDialogText);
        out.writeString(this.stopDialogPositiveCta);
        out.writeString(this.stopDialogNegativeCta);
        out.writeString(this.goalAddedToast);
        out.writeString(this.downloadProgressToast);
        out.writeString(this.downloadCompleteToast);
        out.writeString(this.downloadFailedToast);
        out.writeString(this.audioFailedToast);
        out.writeString(this.gifFailedToast);
        ArrayList<RecommendedPhysicalActivityGifTips> arrayList3 = this.gifTipsList;
        if (arrayList3 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(arrayList3.size());
        Iterator<RecommendedPhysicalActivityGifTips> it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(out, i6);
        }
    }

    public RecommendedActivityContentModel(String label, String str, String str2, String str3, String str4, String str5, String str6, ArrayList<RecommendedActivityHintListModel> arrayList, String str7, String str8, int i6, ArrayList<RecommendedActivityHintListModel> arrayList2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ArrayList<RecommendedPhysicalActivityGifTips> arrayList3) {
        i.g(label, "label");
        this.label = label;
        this.title = str;
        this.ctaGoalAdd = str2;
        this.ctaGoalAdded = str3;
        this.ctaGoalTrack = str4;
        this.ctaDone = str5;
        this.tipsDescription = str6;
        this.tipsIconsList = arrayList;
        this.tipsTitle = str7;
        this.duration = str8;
        this.loops = i6;
        this.tipsContent = arrayList2;
        this.stopDialogText = str9;
        this.stopDialogPositiveCta = str10;
        this.stopDialogNegativeCta = str11;
        this.goalAddedToast = str12;
        this.downloadProgressToast = str13;
        this.downloadCompleteToast = str14;
        this.downloadFailedToast = str15;
        this.audioFailedToast = str16;
        this.gifFailedToast = str17;
        this.gifTipsList = arrayList3;
    }

    public /* synthetic */ RecommendedActivityContentModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, String str8, String str9, int i6, ArrayList arrayList2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, ArrayList arrayList3, int i10, d dVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : arrayList, (i10 & 256) != 0 ? null : str8, (i10 & 512) != 0 ? null : str9, (i10 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? 0 : i6, (i10 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? null : arrayList2, (i10 & 4096) != 0 ? null : str10, (i10 & 8192) != 0 ? null : str11, (i10 & 16384) != 0 ? null : str12, (i10 & 32768) != 0 ? null : str13, (i10 & 65536) != 0 ? null : str14, (i10 & 131072) != 0 ? null : str15, (i10 & 262144) != 0 ? null : str16, (i10 & 524288) != 0 ? null : str17, (i10 & 1048576) != 0 ? null : str18, (i10 & 2097152) != 0 ? null : arrayList3);
    }
}
