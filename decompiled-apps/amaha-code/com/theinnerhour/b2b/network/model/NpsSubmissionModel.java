package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: NpsSubmissionModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/network/model/NpsSubmissionModel;", "", "score", "", "trackCount", "feedback", "", "identifier", "npsType", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeedback", "()Ljava/lang/String;", "getIdentifier", "getNpsType", "getScore", "()I", "getTrackCount", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NpsSubmissionModel {
    @b("feedback")
    private final String feedback;
    @b("identifier")
    private final String identifier;
    @b("type")
    private final String npsType;
    @b("score")
    private final int score;
    @b("tracks")
    private final int trackCount;

    public NpsSubmissionModel(int i6, int i10, String str, String str2, String npsType) {
        i.g(npsType, "npsType");
        this.score = i6;
        this.trackCount = i10;
        this.feedback = str;
        this.identifier = str2;
        this.npsType = npsType;
    }

    public final String getFeedback() {
        return this.feedback;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getNpsType() {
        return this.npsType;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getTrackCount() {
        return this.trackCount;
    }
}
