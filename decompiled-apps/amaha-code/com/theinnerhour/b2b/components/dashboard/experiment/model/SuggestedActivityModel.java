package com.theinnerhour.b2b.components.dashboard.experiment.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.R;
import com.google.firebase.database.PropertyName;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: SuggestedActivityModel.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 M2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\bJ\u0010KB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010LJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010*\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R2\u0010/\u001a\u0012\u0012\u0004\u0012\u00020 0-j\b\u0012\u0004\u0012\u00020 `.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00105\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0012\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010\u0015R*\u00107\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0012\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u0010\u0015R.\u00109\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010D\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\"\u001a\u0004\bE\u0010$\"\u0004\bF\u0010&R$\u0010G\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\"\u001a\u0004\bH\u0010$\"\u0004\bI\u0010&¨\u0006N"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/model/SuggestedActivityModel;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lhs/k;", "writeToParcel", "describeContents", Constants.DAYMODEL_POSITION, "I", "getPosition", "()I", "setPosition", "(I)V", "", "<set-?>", "isCompleted", "Z", "()Z", "setCompleted", "(Z)V", "", "start_date", "J", "getStart_date", "()J", "setStart_date", "(J)V", "last_accessed_date", "getLast_accessed_date", "setLast_accessed_date", "", "content_id", "Ljava/lang/String;", "getContent_id", "()Ljava/lang/String;", "setContent_id", "(Ljava/lang/String;)V", "content_label", "getContent_label", "setContent_label", "symptom", "getSymptom", "setSymptom", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "tags", "Ljava/util/ArrayList;", "getTags", "()Ljava/util/ArrayList;", "setTags", "(Ljava/util/ArrayList;)V", "isFavorite", "setFavorite", "isFree", "setFree", "isFiller", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setFiller", "(Ljava/lang/Boolean;)V", "weightage", "Ljava/lang/Long;", "getWeightage", "()Ljava/lang/Long;", "setWeightage", "(Ljava/lang/Long;)V", "parentActivity", "getParentActivity", "setParentActivity", "dynamicVariant", "getDynamicVariant", "setDynamicVariant", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SuggestedActivityModel implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private String content_id;
    private String content_label;
    private String dynamicVariant;
    private boolean isCompleted;
    private boolean isFavorite;
    private Boolean isFiller;
    private boolean isFree;
    private long last_accessed_date;
    private String parentActivity;
    private int position;
    private long start_date;
    private String symptom;
    private ArrayList<String> tags;
    private Long weightage;

    /* compiled from: SuggestedActivityModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/model/SuggestedActivityModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/theinnerhour/b2b/components/dashboard/experiment/model/SuggestedActivityModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/theinnerhour/b2b/components/dashboard/experiment/model/SuggestedActivityModel;", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class CREATOR implements Parcelable.Creator<SuggestedActivityModel> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(d dVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SuggestedActivityModel createFromParcel(Parcel parcel) {
            i.g(parcel, "parcel");
            return new SuggestedActivityModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SuggestedActivityModel[] newArray(int i6) {
            return new SuggestedActivityModel[i6];
        }
    }

    public SuggestedActivityModel() {
        this.tags = new ArrayList<>();
        this.isFiller = Boolean.FALSE;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getContent_id() {
        return this.content_id;
    }

    public final String getContent_label() {
        return this.content_label;
    }

    public final String getDynamicVariant() {
        return this.dynamicVariant;
    }

    public final long getLast_accessed_date() {
        return this.last_accessed_date;
    }

    public final String getParentActivity() {
        return this.parentActivity;
    }

    public final int getPosition() {
        return this.position;
    }

    public final long getStart_date() {
        return this.start_date;
    }

    public final String getSymptom() {
        return this.symptom;
    }

    public final ArrayList<String> getTags() {
        return this.tags;
    }

    public final Long getWeightage() {
        return this.weightage;
    }

    @PropertyName("isCompleted")
    public final boolean isCompleted() {
        return this.isCompleted;
    }

    @PropertyName("isFavorite")
    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @PropertyName("isFiller")
    public final Boolean isFiller() {
        return this.isFiller;
    }

    @PropertyName("isFree")
    public final boolean isFree() {
        return this.isFree;
    }

    @PropertyName("isCompleted")
    public final void setCompleted(boolean z10) {
        this.isCompleted = z10;
    }

    public final void setContent_id(String str) {
        this.content_id = str;
    }

    public final void setContent_label(String str) {
        this.content_label = str;
    }

    public final void setDynamicVariant(String str) {
        this.dynamicVariant = str;
    }

    @PropertyName("isFavorite")
    public final void setFavorite(boolean z10) {
        this.isFavorite = z10;
    }

    @PropertyName("isFiller")
    public final void setFiller(Boolean bool) {
        this.isFiller = bool;
    }

    @PropertyName("isFree")
    public final void setFree(boolean z10) {
        this.isFree = z10;
    }

    public final void setLast_accessed_date(long j10) {
        this.last_accessed_date = j10;
    }

    public final void setParentActivity(String str) {
        this.parentActivity = str;
    }

    public final void setPosition(int i6) {
        this.position = i6;
    }

    public final void setStart_date(long j10) {
        this.start_date = j10;
    }

    public final void setSymptom(String str) {
        this.symptom = str;
    }

    public final void setTags(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.tags = arrayList;
    }

    public final void setWeightage(Long l2) {
        this.weightage = l2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        i.g(parcel, "parcel");
        parcel.writeInt(this.position);
        parcel.writeByte(this.isCompleted ? (byte) 1 : (byte) 0);
        parcel.writeString(this.dynamicVariant);
        parcel.writeLong(this.start_date);
        parcel.writeLong(this.last_accessed_date);
        Long l2 = this.weightage;
        if (l2 != null) {
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.content_id);
        parcel.writeString(this.content_label);
        parcel.writeString(this.symptom);
        parcel.writeByte(this.isFavorite ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFree ? (byte) 1 : (byte) 0);
        parcel.writeByte(i.b(this.isFiller, Boolean.TRUE) ? (byte) 1 : (byte) 0);
        parcel.writeString(this.parentActivity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuggestedActivityModel(Parcel parcel) {
        this();
        i.g(parcel, "parcel");
        this.position = parcel.readInt();
        this.isCompleted = parcel.readByte() != 0;
        this.start_date = parcel.readLong();
        this.last_accessed_date = parcel.readLong();
        this.weightage = Long.valueOf(parcel.readLong());
        this.content_id = parcel.readString();
        this.content_label = parcel.readString();
        this.symptom = parcel.readString();
        this.isFavorite = parcel.readByte() != 0;
        this.isFree = parcel.readByte() != 0;
        this.isFiller = Boolean.valueOf(parcel.readByte() != 0);
        this.dynamicVariant = parcel.readString();
        this.parentActivity = parcel.readString();
    }
}
