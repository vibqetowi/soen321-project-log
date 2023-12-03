package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.google.firebase.database.Exclude;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import tf.b;
/* compiled from: CourseDayModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001e\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/theinnerhour/b2b/model/CourseDayModel;", "", "()V", "hero_banner", "Lcom/theinnerhour/b2b/model/CourseHeroBannerModel;", "getHero_banner", "()Lcom/theinnerhour/b2b/model/CourseHeroBannerModel;", "setHero_banner", "(Lcom/theinnerhour/b2b/model/CourseHeroBannerModel;)V", "isCompleted", "", "()Z", "setCompleted", "(Z)V", "isMilestone", "setMilestone", "isShow_activities", "setShow_activities", "isShow_articles", "setShow_articles", "isShow_goals", "setShow_goals", "isShow_gratitude", "setShow_gratitude", "isShow_scheduling", "setShow_scheduling", "isShow_thoughts", "setShow_thoughts", Constants.DAYMODEL_POSITION, "", "getPosition", "()I", "setPosition", "(I)V", "start_date", "", "getStart_date", "()J", "setStart_date", "(J)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CourseDayModel {
    private CourseHeroBannerModel hero_banner;
    @Exclude
    private boolean isCompleted;
    @Exclude
    @b("is_milestone")
    private boolean isMilestone;
    @Exclude
    @b("show_activities")
    private boolean isShow_activities;
    @Exclude
    @b("show_articles")
    private boolean isShow_articles;
    @Exclude
    @b("show_goals")
    private boolean isShow_goals;
    @Exclude
    @b("show_gratitude")
    private boolean isShow_gratitude;
    @Exclude
    @b("show_scheduling")
    private boolean isShow_scheduling;
    @Exclude
    @b("show_thoughts")
    private boolean isShow_thoughts;
    private int position;
    private long start_date;

    public final CourseHeroBannerModel getHero_banner() {
        return this.hero_banner;
    }

    public final int getPosition() {
        return this.position;
    }

    public final long getStart_date() {
        return this.start_date;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final boolean isMilestone() {
        return this.isMilestone;
    }

    public final boolean isShow_activities() {
        return this.isShow_activities;
    }

    public final boolean isShow_articles() {
        return this.isShow_articles;
    }

    public final boolean isShow_goals() {
        return this.isShow_goals;
    }

    public final boolean isShow_gratitude() {
        return this.isShow_gratitude;
    }

    public final boolean isShow_scheduling() {
        return this.isShow_scheduling;
    }

    public final boolean isShow_thoughts() {
        return this.isShow_thoughts;
    }

    public final void setCompleted(boolean z10) {
        this.isCompleted = z10;
    }

    public final void setHero_banner(CourseHeroBannerModel courseHeroBannerModel) {
        this.hero_banner = courseHeroBannerModel;
    }

    public final void setMilestone(boolean z10) {
        this.isMilestone = z10;
    }

    public final void setPosition(int i6) {
        this.position = i6;
    }

    public final void setShow_activities(boolean z10) {
        this.isShow_activities = z10;
    }

    public final void setShow_articles(boolean z10) {
        this.isShow_articles = z10;
    }

    public final void setShow_goals(boolean z10) {
        this.isShow_goals = z10;
    }

    public final void setShow_gratitude(boolean z10) {
        this.isShow_gratitude = z10;
    }

    public final void setShow_scheduling(boolean z10) {
        this.isShow_scheduling = z10;
    }

    public final void setShow_thoughts(boolean z10) {
        this.isShow_thoughts = z10;
    }

    public final void setStart_date(long j10) {
        this.start_date = j10;
    }
}
