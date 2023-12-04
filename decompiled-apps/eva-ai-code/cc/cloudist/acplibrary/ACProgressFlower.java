package cc.cloudist.acplibrary;

import android.content.Context;
import android.content.DialogInterface;
import cc.cloudist.acplibrary.views.FlowerView;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes3.dex */
public class ACProgressFlower extends ACProgressBaseDialog {
    private Builder mBuilder;
    private FlowerView mFlowerView;
    private int mSpinCount;
    private Timer mTimer;

    static /* synthetic */ int access$208(ACProgressFlower aCProgressFlower) {
        int i = aCProgressFlower.mSpinCount;
        aCProgressFlower.mSpinCount = i + 1;
        return i;
    }

    private ACProgressFlower(Builder builder) {
        super(builder.mContext);
        this.mSpinCount = 0;
        this.mBuilder = builder;
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cc.cloudist.acplibrary.ACProgressFlower.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (ACProgressFlower.this.mTimer != null) {
                    ACProgressFlower.this.mTimer.cancel();
                    ACProgressFlower.this.mTimer = null;
                }
                ACProgressFlower.this.mSpinCount = 0;
                ACProgressFlower.this.mFlowerView = null;
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        if (this.mFlowerView == null) {
            this.mFlowerView = new FlowerView(this.mBuilder.mContext, (int) (getMinimumSideOfScreen(this.mBuilder.mContext) * this.mBuilder.mSizeRatio), this.mBuilder.mBackgroundColor, this.mBuilder.mBackgroundAlpha, this.mBuilder.mBackgroundCornerRadius, this.mBuilder.mPetalThickness, this.mBuilder.mPetalCount, this.mBuilder.mPetalAlpha, this.mBuilder.mBorderPadding, this.mBuilder.mCenterPadding, this.mBuilder.mThemeColor, this.mBuilder.mFadeColor, this.mBuilder.mText, this.mBuilder.mTextSize, this.mBuilder.mTextColor, this.mBuilder.mTextAlpha, this.mBuilder.mTextMarginTop, this.mBuilder.mTextExpandWidth);
        }
        super.setContentView(this.mFlowerView);
        super.show();
        long j = 1000.0f / this.mBuilder.mSpeed;
        Timer timer = new Timer();
        this.mTimer = timer;
        timer.scheduleAtFixedRate(new TimerTask() { // from class: cc.cloudist.acplibrary.ACProgressFlower.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int i = ACProgressFlower.this.mSpinCount % ACProgressFlower.this.mBuilder.mPetalCount;
                if (ACProgressFlower.this.mBuilder.mDirection == 100) {
                    ACProgressFlower.this.mFlowerView.updateFocusIndex(i);
                } else {
                    ACProgressFlower.this.mFlowerView.updateFocusIndex((ACProgressFlower.this.mBuilder.mPetalCount - 1) - i);
                }
                if (i == 0) {
                    ACProgressFlower.this.mSpinCount = 1;
                } else {
                    ACProgressFlower.access$208(ACProgressFlower.this);
                }
            }
        }, j, j);
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        private Context mContext;
        private float mSizeRatio = 0.25f;
        private float mBorderPadding = 0.55f;
        private float mCenterPadding = 0.27f;
        private int mBackgroundColor = -16777216;
        private int mThemeColor = -1;
        private int mFadeColor = -12303292;
        private int mPetalCount = 12;
        private int mPetalThickness = 9;
        private float mPetalAlpha = 0.5f;
        private float mBackgroundCornerRadius = 20.0f;
        private float mBackgroundAlpha = 0.5f;
        private int mDirection = 100;
        private float mSpeed = 9.0f;
        private String mText = null;
        private int mTextColor = -1;
        private float mTextAlpha = 0.5f;
        private float mTextSize = 40.0f;
        private int mTextMarginTop = 40;
        private boolean mTextExpandWidth = true;

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder sizeRatio(float f) {
            this.mSizeRatio = f;
            return this;
        }

        public Builder borderPadding(float f) {
            this.mBorderPadding = f;
            return this;
        }

        public Builder centerPadding(float f) {
            this.mCenterPadding = f;
            return this;
        }

        public Builder bgColor(int i) {
            this.mBackgroundColor = i;
            return this;
        }

        public Builder themeColor(int i) {
            this.mThemeColor = i;
            return this;
        }

        public Builder fadeColor(int i) {
            this.mFadeColor = i;
            return this;
        }

        public Builder petalCount(int i) {
            this.mPetalCount = i;
            return this;
        }

        public Builder petalThickness(int i) {
            this.mPetalThickness = i;
            return this;
        }

        public Builder petalAlpha(float f) {
            this.mPetalAlpha = f;
            return this;
        }

        public Builder bgCornerRadius(float f) {
            this.mBackgroundCornerRadius = f;
            return this;
        }

        public Builder bgAlpha(float f) {
            this.mBackgroundAlpha = f;
            return this;
        }

        public Builder direction(int i) {
            this.mDirection = i;
            return this;
        }

        public Builder speed(float f) {
            this.mSpeed = f;
            return this;
        }

        public Builder text(String str) {
            this.mText = str;
            return this;
        }

        public Builder textSize(int i) {
            this.mTextSize = i;
            return this;
        }

        public Builder textColor(int i) {
            this.mTextColor = i;
            return this;
        }

        public Builder textAlpha(float f) {
            this.mTextAlpha = f;
            return this;
        }

        public Builder textMarginTop(int i) {
            this.mTextMarginTop = i;
            return this;
        }

        public Builder isTextExpandWidth(boolean z) {
            this.mTextExpandWidth = z;
            return this;
        }

        public ACProgressFlower build() {
            return new ACProgressFlower(this);
        }
    }
}
