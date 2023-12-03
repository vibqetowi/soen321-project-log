package com.theinnerhour.b2b.utils;

import android.graphics.Color;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.GamificationBadgesModel;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.model.GratitudeJournalQuestionModel;
import com.theinnerhour.b2b.model.Testimonial;
import com.theinnerhour.b2b.model.ThoughtsModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* loaded from: classes2.dex */
public class Constants {
    public static final String A3_OFFERING_FLOW_FLAG = "a3_offering_flow";
    public static final String A3_ONBOARDING_EXPERIMENT = "a3_onboarding_experiment";
    public static final String A3_ONBOARDING_REVAMP = "a3_onboarding_experiment_revamp";
    public static final String A3_VAR_B_FLOW_FLAG = "a3_var_b_offering_flow";
    public static final String ACTIVITY_ID_ANGER_BEACH_VISUALISATION = "anger-beach-visualisation";
    public static final String ACTIVITY_ID_ANGER_CLIMBING_STAIRS = "anger-gentle-massage";
    public static final String ACTIVITY_ID_ANGER_COUNT_TO_TEN = "anger-count-to-ten";
    public static final String ACTIVITY_ID_ANGER_CYCLING = "anger-cycling";
    public static final String ACTIVITY_ID_ANGER_DEEP_BREATHING = "anger-deep-breathing";
    public static final String ACTIVITY_ID_ANGER_GENTLE_MASSAGES = "anger-gentle-massages";
    public static final String ACTIVITY_ID_ANGER_GET_ORGANISED = "anger-get-organised";
    public static final String ACTIVITY_ID_ANGER_GOOD_LAUGH = "anger-good-laugh";
    public static final String ACTIVITY_ID_ANGER_GUIDED_IMAGERY = "anger-guided-imaery";
    public static final String ACTIVITY_ID_ANGER_LISTEN_SOOTHING_MUSIC = "anger-soothing-music";
    public static final String ACTIVITY_ID_ANGER_MINDFUL_WALKING = "anger-mindful-walking";
    public static final String ACTIVITY_ID_ANGER_PROGRESSIVE_MUSCLE_RELAXATION = "anger-progressive-muscle-relaxation";
    public static final String ACTIVITY_ID_ANGER_RUNNING = "anger-running";
    public static final String ACTIVITY_ID_ANGER_SELF_COMPASSION = "anger-self-compassion";
    public static final String ACTIVITY_ID_ANGER_SKIPPING_ROPE = "anger-skipping-rope";
    public static final String ACTIVITY_ID_ANGER_SPEND_TIME_IN_NATURE = "anger-spend-time-in-nature";
    public static final String ACTIVITY_ID_ANGER_TALK_TO_A_FRIEND = "anger-talk-to-a-friend";
    public static final String ACTIVITY_ID_ANGER_THOUGHT_DEFUSION = "anger-thought-defusion";
    public static final String ACTIVITY_ID_ANGER_WALKING = "anger-walking";
    public static final String ACTIVITY_ID_ANGER_WRITE_DOWN = "anger-write-down";
    public static final String ACTIVITY_ID_DEPRESSION_BEACH_VISUALISATION = "depression-beach-visualisation";
    public static final String ACTIVITY_ID_DEPRESSION_CLIMBING_STAIRS = "depression-climbing-stairs";
    public static final String ACTIVITY_ID_DEPRESSION_CYCLING = "depression-cycling";
    public static final String ACTIVITY_ID_DEPRESSION_DEEP_BREATHING = "depression-deep-breathing";
    public static final String ACTIVITY_ID_DEPRESSION_GENTLE_MASSAGES = "depression-gentle-massages";
    public static final String ACTIVITY_ID_DEPRESSION_GET_ORGANISED = "depression-get-organised";
    public static final String ACTIVITY_ID_DEPRESSION_GIVE_SOMEONE_HUG = "depression-give-someone-hug";
    public static final String ACTIVITY_ID_DEPRESSION_GOOD_LAUGH = "depression-good-laugh";
    public static final String ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY = "depression-guided-imagery";
    public static final String ACTIVITY_ID_DEPRESSION_JOGGING = "depression-jogging";
    public static final String ACTIVITY_ID_DEPRESSION_LEND_HELPING_HAND = "depression-lend-helping-hand";
    public static final String ACTIVITY_ID_DEPRESSION_LISTEN_SOOTHING_MUSIC = "depression-soothing-music";
    public static final String ACTIVITY_ID_DEPRESSION_MINDFUL_WALKING = "depression-mindful-walking";
    public static final String ACTIVITY_ID_DEPRESSION_PROGRESSIVE_MUSCLE_RELAXATION = "depression-progressive-muscle-relaxation";
    public static final String ACTIVITY_ID_DEPRESSION_REACH_OUT_TO_PETS = "depression-reach-out-to-pets";
    public static final String ACTIVITY_ID_DEPRESSION_RUNNING = "depression-running";
    public static final String ACTIVITY_ID_DEPRESSION_SELF_COMPASSION = "depression-self-compassion";
    public static final String ACTIVITY_ID_DEPRESSION_SPEND_TIME_IN_NATURE = "depression-spend-time-in-nature";
    public static final String ACTIVITY_ID_DEPRESSION_TALK_TO_A_FRIEND = "depression-talk-to-a-friend";
    public static final String ACTIVITY_ID_DEPRESSION_THOUGHT_DEFUSION = "depression-thought-defusion";
    public static final String ACTIVITY_ID_DEPRESSION_TRY_SMILING = "depression-try-smiling";
    public static final String ACTIVITY_ID_DEPRESSION_VIEW_OLD_PHOTO = "depression-view-old-photo";
    public static final String ACTIVITY_ID_DEPRESSION_WALKING = "depression-walking";
    public static final String ACTIVITY_ID_HAPPINESS_BEACH_VISUALISATION = "happiness-beach-visualisation";
    public static final String ACTIVITY_ID_HAPPINESS_CLIMBING_STAIRS = "happiness-climbing-stairs";
    public static final String ACTIVITY_ID_HAPPINESS_CYCLING = "happiness-cycling";
    public static final String ACTIVITY_ID_HAPPINESS_DEEP_BREATHING = "happiness-deep-breathing";
    public static final String ACTIVITY_ID_HAPPINESS_GENTLE_MASSAGES = "happiness-gentle-massages";
    public static final String ACTIVITY_ID_HAPPINESS_GUIDED_IMAGERY = "happiness-guided-imagery";
    public static final String ACTIVITY_ID_HAPPINESS_JOGGING = "happiness-jogging";
    public static final String ACTIVITY_ID_HAPPINESS_MINDFUL_WALKING = "happiness-mindful-walking";
    public static final String ACTIVITY_ID_HAPPINESS_PROGRESSIVE_MUSCLE_RELAXATION = "happiness-progressive-muscle-relaxation";
    public static final String ACTIVITY_ID_HAPPINESS_SELF_COMPASSION = "happiness-self-compassion";
    public static final String ACTIVITY_ID_HAPPINESS_THOUGHT_DEFUSION = "happiness-thought-defusion";
    public static final String ACTIVITY_ID_HAPPINESS_WALKING = "happiness-walking";
    public static final String ACTIVITY_ID_SLEEP_BEACH_VISUALISATION = "sleep-beach-visualisation";
    public static final String ACTIVITY_ID_SLEEP_CLIMBING_STAIRS = "sleep-climbing-stairs";
    public static final String ACTIVITY_ID_SLEEP_CYCLING = "sleep-cycling";
    public static final String ACTIVITY_ID_SLEEP_DEEP_BREATHING = "sleep-deep-breathing";
    public static final String ACTIVITY_ID_SLEEP_FRESH_AIR = "sleep-fresh-air";
    public static final String ACTIVITY_ID_SLEEP_GENTLE_MASSAGES = "sleep-gentle-massages";
    public static final String ACTIVITY_ID_SLEEP_GUIDED_IMAGERY = "sleep-guided-imagery";
    public static final String ACTIVITY_ID_SLEEP_HUMOUR_DISTRACTION = "sleep-humour-distraction";
    public static final String ACTIVITY_ID_SLEEP_JOGGING = "sleep-jogging";
    public static final String ACTIVITY_ID_SLEEP_MINDFUL_WALKING = "sleep-mindful-walking";
    public static final String ACTIVITY_ID_SLEEP_PROGRESSIVE_MUSCLE_RELAXATION = "sleep-progressive-muscle-relaxation";
    public static final String ACTIVITY_ID_SLEEP_SELF_COMPASSION = "sleep-self-compassion";
    public static final String ACTIVITY_ID_SLEEP_SKIPPING_ROPE = "sleep-skipping-rope";
    public static final String ACTIVITY_ID_SLEEP_TALKING_ABOUT_IT = "sleep-talking-about-it";
    public static final String ACTIVITY_ID_SLEEP_THOUGHT_DEFUSION = "sleep-thought-defusion";
    public static final String ACTIVITY_ID_SLEEP_WALKING = "sleep-walking";
    public static final String ACTIVITY_ID_STRESS_BEACH_VISUALISATION = "stress-beach-visualisation";
    public static final String ACTIVITY_ID_STRESS_CLIMBING_STAIRS = "stress-climbing-stairs";
    public static final String ACTIVITY_ID_STRESS_CYCLING = "stress-cycling";
    public static final String ACTIVITY_ID_STRESS_DEEP_BREATHING = "stress-deep-breathing";
    public static final String ACTIVITY_ID_STRESS_FRESH_AIR = "stress-fresh-air";
    public static final String ACTIVITY_ID_STRESS_GENTLE_MASSAGES = "stress-gentle-massages";
    public static final String ACTIVITY_ID_STRESS_GUIDED_IMAGERY = "stress-guided-imagery";
    public static final String ACTIVITY_ID_STRESS_HUMOUR_DISTRACTION = "stress-humour-distraction";
    public static final String ACTIVITY_ID_STRESS_JOGGING = "stress-jogging";
    public static final String ACTIVITY_ID_STRESS_MINDFUL_WALKING = "stress-mindful-walking";
    public static final String ACTIVITY_ID_STRESS_PROGRESSIVE_MUSCLE_RELAXATION = "stress-progressive-muscle-relaxation";
    public static final String ACTIVITY_ID_STRESS_RUNNING = "stress-running";
    public static final String ACTIVITY_ID_STRESS_SELF_COMPASSION = "stress-self-compassion";
    public static final String ACTIVITY_ID_STRESS_SKIPPING_ROPE = "stress-skipping-rope";
    public static final String ACTIVITY_ID_STRESS_TALKING_ABOUT_IT = "stress-talking-about-it";
    public static final String ACTIVITY_ID_STRESS_THOUGHT_DEFUSION = "stress-thought-defusion";
    public static final String ACTIVITY_ID_STRESS_WALKING = "stress-walking";
    public static final String ACTIVITY_ID_WORRY_BEACH_VISUALISATION = "worry-beach-visualisation";
    public static final String ACTIVITY_ID_WORRY_CYCLING = "worry-cycling";
    public static final String ACTIVITY_ID_WORRY_DEEP_BREATHING = "worry-deep-breathing";
    public static final String ACTIVITY_ID_WORRY_DISTRACT_YOURSELF = "worry-distract-yourself";
    public static final String ACTIVITY_ID_WORRY_ENGAGE_IN_ENJOYABLE_ACTIVITIES = "worry-engage-in-enjoyable-activities";
    public static final String ACTIVITY_ID_WORRY_GENTLE_MASSAGES = "worry-gentle-massage";
    public static final String ACTIVITY_ID_WORRY_GET_ORGANISED = "worry-get-organised";
    public static final String ACTIVITY_ID_WORRY_GOOD_LAUGH = "worry-good-laugh";
    public static final String ACTIVITY_ID_WORRY_GUIDED_IMAGERY = "worry-guided-imaery";
    public static final String ACTIVITY_ID_WORRY_MINDFUL_WALKING = "worry-mindful-walking";
    public static final String ACTIVITY_ID_WORRY_PROGRESSIVE_MUSCLE_RELAXATION = "worry-progressive-muscle-relaxation";
    public static final String ACTIVITY_ID_WORRY_RUNNING = "worry-running";
    public static final String ACTIVITY_ID_WORRY_SELF_COMPASSION = "worry-self-compassion";
    public static final String ACTIVITY_ID_WORRY_SKIPPING_ROPE = "worry-skipping-rope";
    public static final String ACTIVITY_ID_WORRY_THOUGHT_DEFUSION = "worry-thought-defusion";
    public static final String ACTIVITY_ID_WORRY_WALKING = "worry-walking";
    public static final Boolean ACTIVITY_UNLOCK;
    public static final Boolean ANALYTICS_SEND;
    public static final String API_COURSE_LINK = "link";
    public static final String APP_APPOINTMENT = "app_appointment";
    public static final String APP_FEEDBACK_DASHBOARD_DATE = "dashboard_feedback_date";
    public static final String APP_FEEDBACK_DASHBOARD_GIVEN_DATE = "dashboard_feedback_given_date";
    public static final String APP_FEEDBACK_DATE = "app_feedback_date";
    public static final String APP_FEEDBACK_DAY = "app_feedback_day";
    public static final String APP_FEEDBACK_GOAL_DATE = "goal_feedback_date";
    public static final String APP_FEEDBACK_TRIGGER = "appFeedbackTrigger";
    public static final String APP_OPEN_DATE = "app_open_date";
    public static final String APP_OPEN_DAY = "app_open_day";
    public static final String APP_PROMPTS_EXPERIMENT = "app_prompts_experiment";
    public static final String APP_PSYCH_APPOINTMENT = "app_psych_appointment";
    public static final String APP_RESTART_ACKNOWLEDGE_PURCHASE = "app_restart_ack_purchase";
    public static final String APP_SESSION_COUNT = "app_session_count";
    public static final String AUDIO_MEDIA_ID = "MEDIA_ID";
    public static final int AUDIO_NOTIFICATION_ID = 23032;
    public static final List<String> B2B_USER_TYPES;
    public static final String BADGE_ATTAINED = "badge_attained";
    public static final String BADGE_POPUP_DISPLAYED = "badge_popup_displayed";
    public static final Boolean BASIC_COURSE_UNLOCK;
    public static final String BEACH_VISUALISATION_ID = "beach-visualisation";
    public static final int CAMPAIGN_ASSET_DOWNLOAD_JOB_ID = 1024;
    public static final String CAMPAIGN_ID = "campaign_id";
    public static final String CANCELLED_DIALOG_1_SHOWN = "cancelled_dialog_1_shown";
    public static final String COMMUNITIES_ENABLED = "communities_enabled";
    public static final String COMMUNITY_CACHED = "community_cached";
    public static final String COMMUNITY_ENTRY_POINT_EXPERIMENT = "community_entry_point_experiment";
    public static final String COMPLETED_THOUGHTS_FLOW_BADGE = "completedThoughtsFlow";
    public static final String COMPLETES_ENDURING_GOAL_SECTION_BADGE = "completesEnduringGoalSection";
    public static final String CONTAINED_SKU = "contained_sku";
    public static final String COUPON_STATE_APPLIED = "APPLIED";
    public static final String COUPON_STATE_CONSUMED = "CONSUMED";
    public static final String COUPON_STATE_EXPIRED = "EXPIRED";
    public static final String COUPON_STATE_WRONG_PROMO_CODE = "WRONG PROMO CODE";
    public static final String COURSE_ADHD = "adhd";
    public static final String COURSE_ADHD_DN = "Thrive with Adult ADHD";
    public static final String COURSE_ALL_ID = "course-all";
    public static final String COURSE_ANGER = "anger";
    public static final String COURSE_ANGER_DN = "Managing Anger";
    public static final String COURSE_DEPRESSION = "depression";
    public static final String COURSE_DEPRESSION_DN = "Overcoming Depression";
    public static final String COURSE_EXPERT_CARE_DN = "Expert Care";
    public static final String COURSE_GENERIC = "generic";
    public static final String COURSE_HAPPINESS = "happiness";
    public static final String COURSE_HAPPINESS_DN = "Living Happier";
    public static final String COURSE_ID = "course_id";
    public static final String COURSE_LIBRARY_GOAL_DN = "Library Goal";
    public static final String COURSE_NAME = "course_name";
    public static final String COURSE_OCD = "ocd";
    public static final String COURSE_OCD_DN = "Coping with OCD";
    public static final String COURSE_SLEEP = "sleep";
    public static final String COURSE_SLEEP_DN = "Sleeping Better";
    public static final String COURSE_STRESS = "stress";
    public static final String COURSE_STRESS_DN = "Tackling Stress";
    public static final String COURSE_TITLE = "course_title";
    public static final String COURSE_WORRY = "worry";
    public static final String COURSE_WORRY_DN = "Beating Anxiety";
    public static final Boolean CRASH_REPORT_SEND;
    public static final String CURRENT_COURSE = "current_course";
    public static final int CUSTOM_TRACK_NOTIFICATION_ID = 46064;
    public static final String DAILY_ACTIVITY_GOAL_ID_ANGER_AFFIRMATIONS = "anger-affirmations";
    public static final String DAILY_ACTIVITY_GOAL_ID_ANGER_HELICOPTER_VIEW = "anger-helicopter-view";
    public static final String DAILY_ACTIVITY_GOAL_ID_ANGER_THREE_MINUTE_BREATHING = "anger-three-minute-breathing";
    public static final String DAILY_ACTIVITY_GOAL_ID_ANGER_TIME_OUT = "anger-time-out";
    public static final String DAILY_ACTIVITY_GOAL_ID_ANGER_VISUALISATION = "anger-visualisation";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_DOUBLE_STANDARD_DISPUTE = "depression-double-standard-dispute";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW = "depression-exercises-new";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_FOCUSSED_MEDITATION = "depression-focussed-meditation";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW = "depression-three-good-things-new";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_HOPE_NEW = "depression-hope-new";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW = "depression-mastery-new";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW = "depression-pleasurable-new";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_POSITIVE_QUALITIES = "depression-positive-qualities";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THOUGHTS_NEW = "depression-thoughts-new";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THREE_GOOD_THINGS = "depression-three-good-things";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_TIMEOUT_NEW = "depression-timeout-new";
    public static final String DAILY_ACTIVITY_GOAL_ID_DEPRESSION_TIME_OUT = "depression-time-out";
    public static final String DAILY_ACTIVITY_GOAL_ID_HAPPINESS_AFFIRMATIONS = "happiness-affirmations";
    public static final String DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ALTERNATE_BREATHING = "happiness-alternate-breathing";
    public static final String DAILY_ACTIVITY_GOAL_ID_HAPPINESS_GRATITUDE_AFFIRMATIONS = "happiness-gratitude-affirmations";
    public static final String DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ONE_MINUTE_MINDFULNESS = "happiness-one-minute-mindfulness";
    public static final String DAILY_ACTIVITY_GOAL_ID_SLEEP_AFFIRMATIONS = "sleep-affirmations";
    public static final String DAILY_ACTIVITY_GOAL_ID_SLEEP_HAPPY_PLACE = "sleep-visualize-happy-place";
    public static final String DAILY_ACTIVITY_GOAL_ID_SLEEP_HUMMING = "sleep-humming";
    public static final String DAILY_ACTIVITY_GOAL_ID_SLEEP_TOE_TENSING = "sleep-toe-tensing";
    public static final String DAILY_ACTIVITY_GOAL_ID_SLEEP_WORRY_TIME = "sleep-worry-time";
    public static final String DAILY_ACTIVITY_GOAL_ID_STRESS_ABC_OF_ASSERTIVENESS = "stress-abc-of-assertiveness";
    public static final String DAILY_ACTIVITY_GOAL_ID_STRESS_AFFIRMATIONS = "stress-affirmations";
    public static final String DAILY_ACTIVITY_GOAL_ID_STRESS_DOUBLE_STANDARD_DISPUTE = "stress-double-standard-dispute";
    public static final String DAILY_ACTIVITY_GOAL_ID_STRESS_GROUNDING = "stress-grounding";
    public static final String DAILY_ACTIVITY_GOAL_ID_STRESS_HAPPY_PLACE = "stress-visualize-happy-place";
    public static final String DAILY_ACTIVITY_GOAL_ID_STRESS_STAGES_OF_PROBLEM_SOLVING = "stress-stages-of-problem-solving";
    public static final String DAILY_ACTIVITY_GOAL_ID_WORRY_AFFIRMATIONS = "worry-affirmations";
    public static final String DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION = "worry-focussed-attention-meditation";
    public static final String DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING = "worry-5-4-3-2-1-grounding";
    public static final String DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING_LOWER_BODY = "worry-grounding-lower-body";
    public static final String DAILY_ACTIVITY_GOAL_ID_WORRY_HAPPY_PLACE = "worry-visualize-happy-place";
    public static final String DAILY_ACTIVITY_GOAL_ID_WORRY_WORRY_TIME = "worry-worry-time";
    public static final String DASHBOARD_INTEGRATED_TELECONSULTATION_EXISTING_TOOL = "db_integrated_experiment_existing_tool";
    public static final String DASHBOARD_INTEGRATED_TELECONSULTATION_EXP = "db_integrated_experiment";
    public static final String DASHBOARD_LIBRARY_EXPERIMENT = "dashboard_library_experiment";
    public static final String DASHBOARD_PLAN_CARD_EXPERIMENT = "plan_card_experiment";
    public static final String DASHBOARD_RA_EXPERIMENT = "ra_experiment";
    public static final String DAYMODEL_POSITION = "position";
    public static final String DEEP_BREATHING_ID = "deep-breathing";
    public static final String DYNAMIC_SIGNUP_LINK = "dynamic_signup_link";
    public static final String DYNAMIC_UTM_LINK = "dynamic_utm_link";
    public static final Boolean ENABLE_ONBOARDING_VARIANT;
    public static final Boolean ENABLE_SUBSCRIPTION;
    public static final String FEEDBACK_ACTIVITY = "feedback_activity";
    public static final String FEEDBACK_ISCOMPANY = "iscompany";
    public static final String FEEDBACK_ISPLATFORM = "isplatform";
    public static final String FEEDBACK_POPUP_ACTIVITIES = "activitiesFeedback";
    public static final String FEEDBACK_POPUP_BOOK_SESSION = "bookSessionFeedback";
    public static final String FEEDBACK_POPUP_COMPANY = "companyFeedback";
    public static final String FEEDBACK_POPUP_COPING_FEELING = "copingFeelingFeedback";
    public static final String FEEDBACK_POPUP_ENDURING = "enduringFeedback";
    public static final String FEEDBACK_POPUP_MOOD_SELECTION = "moodSelectionFeedback";
    public static final String FEEDBACK_POPUP_THOUGHTS = "thoughtsFeedback";
    public static final String FEEDBACK_TOP_MENU = "topMenuFeedBack";
    public static final String FETCH_LIBRARY_CONTENT_ON_DB_TIME = "fetch_library_content_on_db_time";
    public static final String FFM_LEARNING_HUB = "free_feature_learning_hub";
    public static final String FFM_MINICOURSES = "free_feature_minicourse";
    public static final String FFM_RECOMMENDED_ACTIVITIES = "free_feature_recommended_activities";
    public static final String FFM_TRACKER = "free_feature_tracker";
    public static final String FIREBASE_CHAT_FROM_USER_ID = "from_user_id";
    public static final String FIREBASE_CHAT_TO_USER_ID = "to_user_id";
    public static final String FIREBASE_CHAT_USERNAME = "from_user_name";
    public static final String FIREBASE_MESSAGE_BROADCAST = "com.theinnerhour.b2b.firebaseMessageBroadcast";
    public static final String FIREBASE_USER_COURSES_NODE = "courses/";
    public static final String FIREBASE_USER_IN_APP_FUNNELING_NODE = "inAppPrompts/";
    public static final String FIRESTORE_GOALS_EXPERIMENT = "firestore_goals_experiment";
    public static final String FIRST_APP_OPEN = "first_app_open";
    public static final String FOCUSSED_ATTENTION_MEDITATION = "focussed_attention_meditation";
    public static final String GAID_SENT_TO_MIXPANEL = "gaid_sent_to_mixpanel";
    public static final int GAMIFICATION_ADD_NEW_GOAL = 10;
    public static final String GAMIFICATION_ADD_NEW_GOAL_TASK = "add_new_goal";
    public static final int GAMIFICATION_COMPLETING_ASSESSMENT = 20;
    public static final String GAMIFICATION_COMPLETING_INITIAL_ASSESSMENT_TASK = "completing_initial_assessment";
    public static final int GAMIFICATION_COURSE_COMPLETITION = 50;
    public static final String GAMIFICATION_COURSE_COMPLETITION_TASK = "course_completion";
    public static final String GAMIFICATION_DASHBOARD_DAILY_TASK = "dashboard_daily_task";
    public static final int GAMIFICATION_DASHBOARD_DAILY_TASK_SCORE = 5;
    public static final int GAMIFICATION_GOAL_3DAYS_COMPLETITION = 20;
    public static final String GAMIFICATION_GOAL_3DAYS_COMPLETITION_TASK = "goal_3days_completion";
    public static final int GAMIFICATION_GOAL_UPDATION = 5;
    public static final String GAMIFICATION_GOAL_UPDATION_TASK = "goal_updation";
    public static final int GAMIFICATION_READING_ARTICLE = 5;
    public static final String GAMIFICATION_READING_ARTICLE_TASK = "reading_article";
    public static final String GENTLE_MASSAGE_ID = "gentle-massages";
    public static final String GOAL = "goal";
    public static final int GOAL_COMPLETED = 2;
    public static final String GOAL_DESC = "goal_desc";
    public static final String GOAL_ID = "goal_id";
    public static final String GOAL_NAME = "goal_name";
    public static final int GOAL_NOT_COMPLETED = 1;
    public static final String GOAL_SCEHDULE_TIME = "goal_schedule_time";
    public static final String GOAL_START_TIME = "goal_start_time";
    public static final String GOAL_SUB_TYPE_ENVIRONMENT = "environmental";
    public static final String GOAL_SUB_TYPE_FOOD = "food";
    public static final String GOAL_SUB_TYPE_LIFESTYLE = "lifestyle";
    public static final String GOAL_SUB_TYPE_MASTERY = "mastery";
    public static final String GOAL_SUB_TYPE_PLEASUREABLE = "pleasureable";
    public static final String GOAL_SUB_TYPE_TIME_TABLE = "timetable";
    public static final String GOAL_SUB_TYPE_TIME_TABLE_MAIN = "timetable_main";
    public static final String GOAL_TYPE = "goal_type";
    public static final String GOAL_TYPE_ACTIVITY_DAILY = "activity_daily";
    public static final String GOAL_TYPE_ACTIVITY_ONCE = "activity_once";
    public static final String GOAL_TYPE_ACTIVITY_SCHEDULING = "activity_scheduling";
    public static final String GOAL_TYPE_ACTIVITY_WEEKLY = "activity_weekly";
    public static final String GOAL_TYPE_CAUSES = "causes";
    public static final String GOAL_TYPE_CHECKLIST = "checklist";
    public static final String GOAL_TYPE_DAILY_ACTIVITY = "daily_activity";
    public static final String GOAL_TYPE_HABIT = "habit";
    public static final String GOAL_TYPE_PHYSICAL_ACTIVITY = "physical_activity";
    public static final String GOAL_TYPE_RELAXATION_ACTIVITY = "relaxation_activity";
    public static final String GOAL_TYPE_THOUGHT = "thought";
    public static final String GRACE_DIALOG_1_SHOWN = "grace_dialog_1_shown";
    public static final String GRACE_DIALOG_2_SHOWN = "grace_dialog_2_shown";
    public static final String GRACE_PRO_SELLING_SCREEN = "grace_pro_selling_screen";
    public static final String GROUNDING = "grounding";
    public static final String GROUNDING_LOWER_BODY = "grounding_lower_body";
    public static final String GUIDED_IMAGERY_ID = "guided-imagery";
    public static final String HAPPINESS_GO_GETTER_BADGE = "completedFoundationCourse";
    public static final String HOLD_DIALOG_1_SHOWN = "hold_dialog_1_shown";
    public static final String HOLD_DIALOG_2_SHOWN = "hold_dialog_2_shown";
    public static final String HOLD_DIALOG_3_SHOWN = "hold_dialog_3_shown";
    public static final String HOLD_DIALOG_4_SHOWN = "hold_dialog_4_shown";
    public static final String HOLD_PLUS_SELLING_SCREEN = "hold_plus_selling_screen";
    public static final String HOLD_PRO_SELLING_SCREEN = "hold_pro_selling_screen";
    public static final String HUMMING = "humming";
    public static final String IH_RESOURCES_EXPERIMENT = "ih_resources_experiment";
    public static final String INTEGRATED_DB_HOMEWORK_SET = "integrated_db_hw_set";
    public static final String IS_INFO_SCREEN_VISITED = "isInfoScreenVisited";
    public static final String IS_OLD_PROFILE = "is_old_profile";
    public static final String JOURNAL_EXPERIMENT = "journal_experiment";
    public static final String JOURNAL_THOUGHTS_ENTRY_PRESENT = "journal_thoughts_entry_present";
    public static final String JOURNAL_THOUGHTS_LEARN_MORE_SHOWN = "journal_thoughts_learn_more_shown";
    public static final String KEY_PR_COUPON = "pr_coupon";
    public static final String KEY_SHOW_REWARD_SCREEN = "show_reward_screen";
    public static final String KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANGER = "show_welcomeback_screen_for_anger";
    public static final String KEY_SHOW_WELCOMEBACK_SCREEN_FOR_ANXIETY = "show_welcomeback_screen_for_anxiety";
    public static final String KEY_SHOW_WELCOMEBACK_SCREEN_FOR_HAPPY = "show_welcomeback_screen_for_happy";
    public static final String KEY_SHOW_WELCOMEBACK_SCREEN_FOR_MOOD = "show_welcomeback_screen_for_mood";
    public static final String KEY_SHOW_WELCOMEBACK_SCREEN_FOR_SLEEP = "show_welcomeback_screen_for_sleep";
    public static final String KEY_SHOW_WELCOMEBACK_SCREEN_FOR_STRESS = "show_welcomeback_screen_for_stress";
    public static final String LEARNING_HUB_READ = "learning_hub_read";
    public static final String LIBRARY_EXPERIMENT_V3 = "library_experiment_v3";
    public static final String LIBRARY_GOAL_COURSE = "generic_library";
    public static final String LIBRARY_GOAL_COURSE_ID = "generic_library_id";
    public static final String LINK_COMMUNITIES_NOTIFICATION = "communities_pwa";
    public static final String LINK_DYNAMIC_CAMPAIGN = "dynamic_campaign_link";
    public static final String LINK_ID = "link_id";
    public static final String LINK_OFFER_60_PLUS_ANNUAL = "offer=ip_plus_annual_60discount&session=0&time=0";
    public static final String LINK_OFFER_PLUS_ANNUAL_PLUS_CLICK_4 = "offer=ip_plus_annual_50discount&session=0&time=24&event=plus_click_4";
    public static final String LINK_OFFER_PRO_QUARTERLY_FREE_TRIAL = "offer=ip_pro_quarterly_40discount_1session&session=1&time=24&event=free_trial_abandoned";
    public static final String LINK_OFFER_PRO_QUARTERLY_PLUS_PURCHASE_CANCELLED = "offer=ip_pro_quarterly_40discount_1session&session=1&time=24&event=plus_purchase_cancelled";
    public static final String LINK_OFFER_PRO_QUARTERLY_PRO_CLICK_3 = "offer=ip_pro_quarterly_40discount_1session&session=1&time=24&event=pro_click_3";
    public static final String LINK_TELECOMMUNICATION_CUSTOM_URL = "tele_custom_url";
    public static final String LINK_TYPE = "link_type";
    public static final String LOCK_FAILED_ATTEMPTS = "lock_failed_attempts";
    public static final String LOCK_FAILED_TIME = "lock_failed_time";
    public static final String LOGIN_SCREEN_EXPERIMENT = "login_screen_experiment";
    public static final Boolean LOG_NETWORK;
    public static final String MAIN_ACTIVITIES_FEEDBACK_COUNTER = "main_activities_feedback_counter";
    public static final String MEDIA_ANALYTICS_RECEIVER_EXTRA = "media_analytics_data";
    public static final String MEDIA_DATA_RECEIVER = "MEDIA_DATA_RECEIVER";
    public static final String MEDIA_RECEIVER_EXTRA = "media_data";
    public static final String MINDFUL_WALKING_ID = "mindful-walking";
    public static final Boolean MINI_COURSE_MONETIZATION_SKIP;
    public static final String NEW_COURSES_EXPERIMENT = "new_courses_experiment";
    public static final String NEW_COURSE_FLAG = "new_course_flag";
    public static final String NEW_PROFILE_TOOLTIP_SHOWN = "new_profile_tooltip_shown";
    public static final String NOTIFICATION_ALLIE_INTERACTION_SHOWED = "notification_allie_interaction_showed";
    public static final String NOTIFICATION_ASK_COUNT = "notification_ask_count";
    public static final String NOTIFICATION_ASK_DAY = "notification_ask_day";
    public static final String NOTIFICATION_BODY = "notification_body";
    public static final String NOTIFICATION_DIALOG_DENY_COUNT = "notification_dialog_deny_count";
    public static final String NOTIFICATION_DIALOG_DISMISS_COUNT = "notification_dialog_dismiss_count";
    public static final String NOTIFICATION_DIALOG_SHOW_COUNT = "notification_dialog_show_count";
    public static final String NOTIFICATION_GROUP_COMMON = "com.theinnerhour.b2b.GROUP_COMMON";
    public static final String NOTIFICATION_INTENT = "notification_intent";
    public static final String NOTIFICATION_JOURNAL_SAVE_COUNT = "notification_journal_save_count";
    public static final String NOTIFICATION_PROVIDER_PROFILE = "notififcation_provider_profile";
    public static final String NOTIFICATION_TITLE = "notification_title";
    public static final String NOTIFICATION_TYPE = "notification_type";
    public static final String NOTIFICATION_URL = "url";
    public static final String NOTIFICATION_WORRY = "worry_time_tool";
    public static final String NOTIF_PERMIT_ASSESSMENT_EXPERIMENT = "notif_permit_assessment_experiment";
    public static final String NOTIF_PERMIT_DESCRIPTION_EXPERIMENT = "notif_permit_description_experiment";
    public static final String NOT_V4_SHOW_FEEDBACK = "not_v4_show_feedback";
    public static final String NO_FREE_SYMPTOM_EXPERIMENT_NOT_V4 = "no_free_symptom_expt_not_v4";
    public static final int NUM_OF_DAYS_PROGRESS = 7;
    public static final String OFFERING_FLOW_FLAG = "offering_flow";
    public static final String OFFLINE = "Offline";
    public static final String OFFLINE_CARD_EXPERT_CARE = "offline_card_expert_care";
    public static final String OFFLINE_CENTERS_IN_CURRENT_LOCATION = "offline_centers_in_current_location";
    public static final String ONBOARDING_EXPERIMENT = "onboarding_experiment";
    public static final String ONBOARDING_EXPERIMENT_EVENT = "onboarding_experiment_assigned";
    public static final String ONBOARDING_VARIANT = "b";
    public static final String ONLINE = "Online";
    public static final Boolean OPEN_FRAGMENT_PLAYGROUND;
    public static final String PLAY_STORE_FEEDBACK_GIVEN = "play_store_feedback_given";
    public static final String PLUS_ANNUAL = "annual";
    public static final String PLUS_MONTHLY = "monthly";
    public static final String PLUS_QUARTERLY = "quarterly";
    public static final String PMR_ID = "progressive-muscle-relaxation";
    public static final String PRIORITY_DEEP_BREATHING_GIF = "deep_breathing_gif";
    public static final String PRIORITY_GUIDED_IMAGERY = "guided_imagery";
    public static final int PROFILE_ASSET_DOWNLOAD_JOB_ID = 2048;
    public static final String PROVIDER_INITIAL_DISCOUNT = "provider_initial_discount";
    public static final String PRO_THERAPIST_ID = "pro_therapist_id";
    public static final String PR_APP_NEW_SUB_FREE_EXPERIMENT = "pr_app_new_sub_free_exp";
    public static final String PR_COUPON_CODE = "ip_pr_coupon_code";
    public static final String PR_COUPON_CODE_SKU = "ip_plus_free_month";
    public static final String RA_GOAL_ID = "ra_goal_id";
    public static final String REACHED_1000_POINTS_BADGE = "reached1000Points";
    public static final String REACHED_100_POINTS_BADGE = "reached50Points";
    public static final String REACHED_500_POINTS_BADGE = "reached500Points";
    public static final String RECOMMENDED_ACTIVITIES_FEEDBACK_SHOWN = "recommended_activities_feedback_shown";
    public static final String RECOMMENDED_ACTIVITIES_PLAYBACK_COUNTER = "recommended_activities_playback_counter";
    public static final String RESOURCES_FEEDBACK_COUNTER = "resources_feedback_counter";
    public static final String RESOURCES_SHOW_FEEDBACK = "resources_show_feedback";
    public static final String SAVE_DYNAMIC_LINK_MIXPANEL = "save_dynamic_link_mixpanel";
    public static final String SCHEDULED_AN_ACTIVITY_BADGE = "scheduledAnActivity";
    public static final String SCREEN_ACCEPTING_UNCERTAINITY = "accepting_uncertainity";
    public static final String SCREEN_ACTIVITIES = "activities";
    public static final String SCREEN_ACTIVITY = "activity";
    public static final String SCREEN_ACTIVITY_1 = "activity_1";
    public static final String SCREEN_ACTIVITY_2 = "activity_2";
    public static final String SCREEN_ACTIVITY_SCHEDULING = "activity_scheduling";
    public static final String SCREEN_APP_FEEDBACK = "app_feedback";
    public static final String SCREEN_ARTICLE = "article";
    public static final String SCREEN_BROWSER = "browser";
    public static final String SCREEN_CHECKLIST = "checklist";
    public static final String SCREEN_COACHMARKS_1 = "coachmark_1";
    public static final String SCREEN_COACH_CHAT = "coach_chat";
    public static final String SCREEN_COMMUNITY = "community";
    public static final String SCREEN_COMMUNITY_POST = "community_post";
    public static final String SCREEN_CONTENT_MARKETING_LIST = "content_marketing_list";
    public static final String SCREEN_COPING = "coping";
    public static final String SCREEN_CURRENT_ACTIVITY = "current_activity";
    public static final String SCREEN_DASHBOARD = "dashboard";
    public static final String SCREEN_DESIGNING_HAPPINESS = "designing_happiness";
    public static final String SCREEN_DOS_AND_DONTS = "dos_and_donts";
    public static final String SCREEN_ENDURING_ASSESSMENT = "enduring_assessment";
    public static final String SCREEN_ENDURING_BEHAVIOUR = "enduring_behaviour";
    public static final String SCREEN_FACTS = "facts";
    public static final String SCREEN_FACTS_DYK = "facts_dyk";
    public static final String SCREEN_FIREBASE_CHAT = "firebase_chat";
    public static final String SCREEN_GOALS_LIST = "goals_list";
    public static final String SCREEN_GRATITUDE_JOURNAL = "gratitude_journal";
    public static final String SCREEN_HAPPINESS_AND_ENVIROMENT = "happiness_enviroment";
    public static final String SCREEN_IN_REPURCHASE = "repurchase_in";
    public static final String SCREEN_LOCUS_OF_CONTROL = "locus_of_control";
    public static final String SCREEN_MINDFULNESS = "mindfullness";
    public static final String SCREEN_MINDFULNESS_ACTIVITY = "mindfullness_activity";
    public static final String SCREEN_MONETIZATION = "monetization";
    public static final String SCREEN_MULTIPLE_TIPS_1 = "multiple_tips_1";
    public static final String SCREEN_MULTIPLE_TIPS_2 = "multiple_tips_2";
    public static final String SCREEN_NOTIFICATION_ACTIVITY = "notification_activity";
    public static final String SCREEN_PHYSICAL_ACTIVITY = "physical_activity";
    public static final String SCREEN_POSITIVE_AND_NEGATIVE = "positive_and_negative";
    public static final String SCREEN_POSITIVE_ENDURING_BEHAVIOUR = "positive_enduring_behaviour";
    public static final String SCREEN_PROBLEM_SOLVING = "problem_solving";
    public static final String SCREEN_PROFILE = "profile";
    public static final String SCREEN_PROGRESS = "progress";
    public static final String SCREEN_PSYCHIATRIST_CHAT = "psychiatrist_chat";
    public static final String SCREEN_QUIZ = "quiz";
    public static final String SCREEN_RACING_MIND = "racing_mind";
    public static final String SCREEN_REASSESSMENT_1 = "reassessment_1";
    public static final String SCREEN_REASSESSMENT_2 = "reassessment_2";
    public static final String SCREEN_RELIEF_BOX = "relief_box";
    public static final String SCREEN_SLIDER_ASSESSMENT = "slider_assessment";
    public static final String SCREEN_SLIDER_ASSESSMENT_FINAL = "slider_assessment_final";
    public static final String SCREEN_SYMPTOMS = "symptoms";
    public static final String SCREEN_T11A = "gratitude_rock";
    public static final String SCREEN_T1F = "t1f";
    public static final String SCREEN_T1G = "t1g";
    public static final String SCREEN_T1H = "t1h";
    public static final String SCREEN_T1I = "t1i";
    public static final String SCREEN_T1J = "self_compassion_pause";
    public static final String SCREEN_T1K = "twenty_minutes_rule";
    public static final String SCREEN_T2A = "t2a";
    public static final String SCREEN_T4C = "t4c";
    public static final String SCREEN_T5A = "scheduling_worry_time";
    public static final String SCREEN_T5B = "worry_time";
    public static final String SCREEN_T6A = "pomodoro";
    public static final String SCREEN_T8A = "abc_assertiveness";
    public static final String SCREEN_T8B = "double_standard_dispute";
    public static final String SCREEN_T8C = "helicopter_view";
    public static final String SCREEN_T8G = "three_good_things";
    public static final String SCREEN_T8I = "stages_of_problem_solving";
    public static final String SCREEN_TAE = "one_minute_mindfulness";
    public static final String SCREEN_THERAPIST_DETAIL = "therapist_detail";
    public static final String SCREEN_THERAPIST_PACKAGES = "therapist_packages";
    public static final String SCREEN_THERAPY_PSYCHIATRY_CHOICE = "therapy_psychiatry_choice";
    public static final String SCREEN_THERAPY_PSYCHIATRY_DRAWER_OPEN = "therapy_psychiatry_drawer_open";
    public static final String SCREEN_THOUGHTS = "thoughts";
    public static final String SCREEN_THOUGHTS_ACTIVITY = "thoughts_activity";
    public static final String SCREEN_THOUGHTS_ARTICLE = "thoughts_article";
    public static final String SCREEN_THOUGHTS_ASSESSMENT = "thoughts_assessment";
    public static final String SCREEN_TIME_TABLE = "time_table";
    public static final String SCREEN_TIP_1 = "tip_1";
    public static final String SCREEN_TIP_2 = "tip_2";
    public static final String SCREEN_TIP_3 = "tip_3";
    public static final String SCREEN_TIP_4 = "tip_4";
    public static final String SCREEN_TIP_5 = "tip_5";
    public static final String SCREEN_TRAKCER = "tracker";
    public static final String SCREEN_V3_ACTIVITY = "v3_activity";
    public static final String SCREEN_VIDEO_1 = "video_1";
    public static final String SELF_COMPASSION_ID = "self-compassion";
    public static final String SELLING_SCREEN_TEST = "selling_screen_test";
    public static final String SESSION_DASHBOARD_PSYCHIATRY = "psychiatrist_dashboard";
    public static final String SESSION_DASHBOARD_THERAPY = "therapist_dashboard";
    public static String SESSION_TYPE_CHAT = null;
    public static final String SHARE_APP_BADGE = "completesShareApp";
    public static final String SHOW_APP_FEEDBACK_POPUP = "appFeedbackPopup";
    public static final String SHOW_MESSAGING_PAGES = "subscription_messaging_show";
    public static final Boolean SKIP_MONETIZATION;
    public static final String STATE_CANCELLED = "SUBSCRIPTION_CANCELED";
    public static final String STATE_GRACE_PERIOD = "SUBSCRIPTION_IN_GRACE_PERIOD";
    public static final String STATE_NOT_PURCHASED = "SUBSCRIPTION_NOT_PURCHASED";
    public static final String STATE_ON_HOLD = "SUBSCRIPTION_ON_HOLD";
    public static final String STATE_PAUSED = "SUBSCRIPTION_PAUSED";
    public static final String STATE_PURCHASED = "SUBSCRIPTION_PURCHASED";
    public static final String STATE_RECOVERED = "SUBSCRIPTION_RECOVERED";
    public static final String STATE_SUBSCRIPTION_EXPIRED = "SUBSCRIPTION_EXPIRED";
    public static final String STATE_SUBSCRIPTION_RENEWED = "SUBSCRIPTION_RENEWED";
    public static final String STATE_SUBSCRIPTION_REVOKED = "SUBSCRIPTION_REVOKED";
    public static final String SUBSCRIPTION_BASIC_1 = "ip_plus_monthly";
    public static final String SUBSCRIPTION_BASIC_2 = "ip_plus_quarterly";
    public static final String SUBSCRIPTION_BASIC_3 = "ip_plus_annual";
    public static final String SUBSCRIPTION_BASIC_5 = "ip_plus_annual_50discount";
    public static final String SUBSCRIPTION_BASIC_FREE = "ip_plus_free_covid";
    public static final String SUBSCRIPTION_EXPIRY_SHOWN = "subscription_expiry_shown";
    public static final String SUBSCRIPTION_GOLD_1 = "ip_pro_monthly";
    public static final String SUBSCRIPTION_GOLD_3 = "ip_pro_quarterly_40discount_1session";
    public static final String SUBSCRIPTION_NONE = "none";
    public static final String SUMMARY_NOTIFICATION_CHANNEL = "summary_channel";
    public static final int SUMMARY_NOTIFICATION_ID = 0;
    public static final String TC_NOTIFICATION_PREPARATION_THINGS = "tc_notification_preparation_things_";
    public static final String TC_NOTIFICATION_PREPARATION_THINGS_CURR_SESSION = "tc_preparation_curr_session_";
    public static final String TC_NOTIFICATION_SESSION_TIPS = "tc_notification_session_tips_";
    public static final String TC_NOTIFICATION_SESSION_TIPS_CURR_SESSION = "tc_session_tips_curr_session_";
    public static final String TELECOMMUNICATION_CONSENT = "provider_consent_given";
    public static final String TELECOMMUNICATION_EXISTING_USER = "telecommuncation_existing_user";
    public static final String TELECOMMUNICATION_REDIRECT = "telecommuncation_redirect";
    public static final String TELE_CACHED = "tele_cached";
    public static final String TELE_ENTRY_POINT_EXPERIMENT = "tele_entry_point_experiment";
    public static final String TEMPLATE_TITLE_KEY = "template_title_key";
    public static final String THOUGHTS_ANGER_BLAMING = "anger-blaming";
    public static final String THOUGHTS_ANGER_BLAMING_TEXT = "I usually blame situations and people for my problems.";
    public static final String THOUGHTS_ANGER_CATASTROPHISATION = "anger-catastrophisation";
    public static final String THOUGHTS_ANGER_CATASTROPHISATION_TEXT = "Things are always much worse for me than they might seem.";
    public static final String THOUGHTS_ANGER_LABELLING = "anger-labelling";
    public static final String THOUGHTS_ANGER_LABELLING_TEXT = "I usually label things or people, based on my experience with them.";
    public static final String THOUGHTS_ANGER_MIND_READING = "anger-mind-reading";
    public static final String THOUGHTS_ANGER_MIND_READING_TEXT = "I can usually tell what someone is thinking about me.";
    public static final String THOUGHTS_ANGER_SHOULD_AND_MUST = "anger-should-and-must";
    public static final String THOUGHTS_ANGER_SHOULD_AND_MUST_TEXT = "I have clear rules for how things should be and I stick to them.";
    public static final String THOUGHTS_BLACK_AND_WHITE_THINKIING = "black-and-white-thinking";
    public static final String THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT = "I usually label things as right or wrong, and good or bad.";
    public static final String THOUGHTS_BLAMING = "blaming";
    public static final String THOUGHTS_BLAMING_TEXT = "I usually blame situations and people for my problems.";
    public static final String THOUGHTS_CATASTROPHISATION = "catastrophisation";
    public static final String THOUGHTS_CATASTROPHISATION_TEXT = "Things are always much worse for me than they might seem.";
    public static final String THOUGHTS_DISCOUNTING_THE_POSITIVE = "discounting-the-positive";
    public static final String THOUGHTS_DISCOUNTING_THE_POSITIVE_TEXT = "I ignore the positives in a situation and feel convinced that they don't matter.";
    public static final String THOUGHTS_EMOTIONAL_REASONING = "emotional-reasoning";
    public static final String THOUGHTS_EMOTIONAL_REASONING_TEXT = "If I'm feeling something, it's usually because it's true.";
    public static final String THOUGHTS_FORTUNE_TELLING = "fortune-telling";
    public static final String THOUGHTS_FORTUNE_TELLING_TEXT = "I can usually tell what is going to happen or how things will pan out.";
    public static final String THOUGHTS_MIND_READING = "mind-reading";
    public static final String THOUGHTS_MIND_READING_TEXT = "I can usually tell what someone is thinking about me.";
    public static final String THOUGHTS_OVERGENERALISATION = "overgeneralisation";
    public static final String THOUGHTS_OVERGENERALISATION_TEXT = "When something bad happens, I conclude that since it has happened once, it will happen again.";
    public static final String THOUGHTS_PERSONALISATION = "personalisation";
    public static final String THOUGHTS_PERSONALISATION_TEXT = "I blame myself when things go wrong, even when they were not under my control.";
    public static final String THOUGHTS_RELATIONSHIP = "relationship";
    public static final String THOUGHTS_SHOULD_AND_MUST = "should-and-must";
    public static final String THOUGHTS_SHOULD_AND_MUST_TEXT = "I have clear rules for how things should be and I stick to them.";
    public static final String THOUGHTS_WORK = "work";
    public static final String THOUGHTS_WORRY_MIND_READING = "worry-mind-reading";
    public static final String THOUGHTS_WORRY_MIND_READING_TEXT = "I can usually tell what someone is thinking about me.";
    public static final String THOUGHT_DEFUSION_ID = "thought-defusion";
    public static final String THOUGHT_GOAL_ID_BLACK_AND_WHITE_THINKIING = "work-black-and-white-thinking";
    public static final String THOUGHT_GOAL_ID_BLAMING = "blaming";
    public static final String THOUGHT_GOAL_ID_CATASTROPHISATION = "work-catastrophisation";
    public static final String THOUGHT_GOAL_ID_DISCOUNTING_THE_POSITIVE = "discounting-the-positive";
    public static final String THOUGHT_GOAL_ID_EMOTIONAL_REASONING = "work-emotional-reasoning";
    public static final String THOUGHT_GOAL_ID_FORTUNE_TELLING = "work-fortune-telling";
    public static final String THOUGHT_GOAL_ID_LABELLING = "labelling";
    public static final String THOUGHT_GOAL_ID_MIND_READING = "work-mind-reading";
    public static final String THOUGHT_GOAL_ID_OVERGENERALISATION = "overgeneralisation";
    public static final String THOUGHT_GOAL_ID_PERSONALISATION = "personalisation";
    public static final String THOUGHT_GOAL_ID_SHOULD_AND_MUST = "work-should-and-must";
    public static final String THREE_MINUTE_BREATHING_SPACE = "three_min_breathing_space";
    public static final int TIMEOUT_MS = 10000;
    public static final String TOE_TENSING = "toe_tensing";
    public static final String TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY = "conflict-resolution-2022";
    public static final String TOPICAL_2022_COVID = "covid-2022";
    public static final String TOPICAL_2022_HEALTH_ANXIETY = "health-anxiety-and-panic-covid-2022";
    public static final String TOPICAL_2022_MOTIVATION = "motivation-2022";
    public static final String TOPICAL_2022_NURTURING_RELATIONSHIP = "nurturing-relationships-2022";
    public static final String TOPICAL_2022_TIME_MANAGEMENT = "time-management-2022";
    public static final String TRACKING_GOALS_FOR_A_WEEK_BADGE = "trackingGoalsForAWeek";
    public static final String TRACKING_YOUR_MOOD_BADGE = "trackingYourMood";
    public static final String TYPING = "Typing";
    public static final String USER_DATA_COLLECTION = "user_tracked_data";
    public static final String USER_GOALS_DATA = "user_goals_data";
    public static final String USER_GOALS_LOGS_DATA = "user_goals_logs_data";
    public static final String USER_GOALS_TRACK_DATA = "user_goals_track_data";
    public static final String USER_JOINED_COMMUNITIES = "user_joined_communities";
    public static final String USER_MULTITRACKER_TRACKED_DATA = "user_multitracker_tracked_data";
    public static final String USER_SIGN_UP_SESSION = "sign_up_session";
    public static final String USER_VERSION = "v3";
    public static final String USE_VARIANT_A = "use_variant_a";
    public static final String VERIFY_EMAIL_POPUP_TIME = "verify_email_popup_time";
    public static final Boolean WEEK_UNLOCK;
    public static final int[] colorCode;
    public static final String[] moodStr;
    public static final int[] trackerSmiley;

    static {
        Boolean bool = Boolean.FALSE;
        WEEK_UNLOCK = bool;
        ACTIVITY_UNLOCK = bool;
        BASIC_COURSE_UNLOCK = bool;
        MINI_COURSE_MONETIZATION_SKIP = bool;
        SKIP_MONETIZATION = bool;
        OPEN_FRAGMENT_PLAYGROUND = bool;
        ENABLE_SUBSCRIPTION = bool;
        LOG_NETWORK = bool;
        ENABLE_ONBOARDING_VARIANT = bool;
        Boolean bool2 = Boolean.TRUE;
        ANALYTICS_SEND = bool2;
        CRASH_REPORT_SEND = bool2;
        SESSION_TYPE_CHAT = "chat";
        colorCode = new int[]{Color.parseColor("#f48791"), Color.parseColor("#fbd7b9"), Color.parseColor("#afe9ef"), Color.parseColor("#d7c4df"), Color.parseColor("#a6dad3")};
        moodStr = new String[]{"Great", "Good", "Fine", "Bad", "Awful"};
        trackerSmiley = new int[]{R.drawable.five, R.drawable.four, R.drawable.three, R.drawable.two, R.drawable.one};
        B2B_USER_TYPES = Arrays.asList("organisation", "employee", "controller", "employeeFamily");
    }

    public static ArrayList<GoalType> getActivities() {
        ArrayList<GoalType> arrayList = new ArrayList<>();
        HashMap<String, String> courseNameIdMap = getCourseNameIdMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(courseNameIdMap.get(COURSE_STRESS));
        arrayList2.add(COURSE_STRESS);
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_STRESS_DEEP_BREATHING, "Deep Breathing", "Practise Deep Breathing", "When your body is stressed, it responds by raising its blood pressure, speeding up breathing and releasing stress hormones. Deep breathing slows down this response, allowing your body to feel calmer in the face of stress.", "Deep Breathing", arrayList2, R.drawable.deep_breathing, "Deep Breathing", "Deep breathing can immediately help you to relax and reduce the production of stress hormones. In the long run, it can improve focus, brain functioning, and benefit the body's digestion and immune system."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_STRESS_GUIDED_IMAGERY, "Guided Imagery", "Practise Guided Imagery", "Guided imagery is a good way to wind down and calm your body after a stressful event. Research shows that it positively impacts heart rate, blood pressure and breathing.", "Guided Imagery", arrayList2, R.drawable.guided, "Guided Imagery", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_STRESS_PROGRESSIVE_MUSCLE_RELAXATION, "Progressive Muscle Relaxation", "Practise Progressive Muscle Relaxation", "Your muscles often become tense as a result of your body preparing to deal with stressful situations. It’s important to release this tension in order to avoid any serious muscle imbalance.", "Progressive Muscle Relaxation", arrayList2, R.drawable.muscle_relaxation, "PMR", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_STRESS_GENTLE_MASSAGES, "Guided Massage", "Carry out Guided Massage", "Research has shown that massages control the stress response by increasing levels of a of a feel-good hormone, serotonin and decreasing the stress hormone cortisol.", "Guided Massage", arrayList2, R.drawable.massage, "Guided Massage", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_STRESS_MINDFUL_WALKING, "Mindful Walking", "Go for a Mindful Walk", "This exercise is an easy way to incorporate mindfulness in your everyday life. It will help you club relaxation with a simple physical activity - which can energise you and boost positive feelings.", "Mindful Walking", arrayList2, R.drawable.ic_mindful_walking, "Mindful Walking", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_STRESS_THOUGHT_DEFUSION, "Thought Defusion", "Practise Thought Defusion", "In difficult situations, you might get negative thoughts that play on your mind. Using thought defusion, you can become aware of these thoughts. You can then let go of them or change them into positive ones.", "Thought Defusion", arrayList2, R.drawable.ic_thought_deffusion, "Thought Defusion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_STRESS_SELF_COMPASSION, "Self-Compassion", "Practise Self-Compassion", "You might find it more difficult to be kind to yourself as compared to others around you. Through self-compassion, you can feel more positive and even cope better in difficult situations.", "Self-Compassion", arrayList2, R.drawable.ic_self_compassion, "Self-Compassion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_STRESS_BEACH_VISUALISATION, "Beach Visualisation", "Practise Beach Visualisation", "This exercise will guide you to imagine a peaceful place, so you can take a mental vacation. It can bring you a sense of calm and peace, and can help you counter feelings of sadness, worry and even stress.", "Beach Visualisation", arrayList2, R.drawable.ic_beach_visualisation, "Beach Visualisation", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_WALKING, "Walking", "Go for a walk", "Walking acts as a stress reducer by triggering the release of endorphins that make you feel relaxed and even relieve pain. They also induce a sense of calm and well-being.", "Walking", arrayList2, R.drawable.ic_walking, "Walking", "Walking is one of the most convenient ways to reduce stress as it triggers the release of endorphins that make you feel relaxed and even relieve pain. These endorphins induce a sense of calm and well-being."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_CLIMBING_STAIRS, "Climbing Stairs", "Climb the stairs", "Climbing the stairs is a physical activity that causes our body to release hormones which act as natural pain relievers reducing stress.", "Climbing Stairs", arrayList2, R.drawable.climbing, "Climbing Stairs", "Climbing the stairs is a physical activity that can be carried out easily. When you climb up and down, your body releases \"feel-good\" hormones which are natural pain relievers, and can greatly reduce feelings of stress."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_JOGGING, "Running", "Go for a jog", "Running increases blood circulation to the brain which prepares you to handle stressful situations and improves your mood.", "Running", arrayList2, R.drawable.jogging, "Running", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_CYCLING, "Cycling", "Go cycling", "Research shows that cycling reduces signs of stress and leaves you feeling more calm and focused.", "Cycling", arrayList2, R.drawable.cycling, "Cycling", "Research shows that cycling reduces symptoms of stress and leaves you feeling more calm and focused."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_SKIPPING_ROPE, "Skipping Rope", "Practise skipping rope", "Skipping reduces stress by releasing endorphins which are not only pain relievers, but also create a sense of calm and well-being.", "Skipping Rope", arrayList2, R.drawable.skipping, "Skipping Rope", "Skipping reduces stress by releasing endorphins which are not only pain relievers, but also create a sense of calm and well-being."));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(courseNameIdMap.get(COURSE_SLEEP));
        arrayList3.add(COURSE_SLEEP);
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_SLEEP_DEEP_BREATHING, "Deep Breathing", "Practise Deep Breathing", "Deep breathing sends signals to your body to calm down. It promotes better blood flow and flushes toxins out of your body - in turn, helping you sleep better.", "Deep Breathing", arrayList3, R.drawable.deep_breathing, "Deep Breathing", "Deep breathing sends signals to your body to calm down. It promotes better blood flow and flushes toxins out of your body - in turn, helping you sleep better."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_SLEEP_GUIDED_IMAGERY, "Guided Imagery", "Practise Guided Imagery", "If practised regularly for a few minutes before sleeping, guided imagery can quieten any racing thoughts in your mind, thereby calming you down. As a result, this technique significantly improves the quality of sleep.", "Guided Imagery", arrayList3, R.drawable.guided, "Guided Imagery", "If practised regularly for a few minutes before sleeping, guided imagery can quieten any racing thoughts in your mind, thereby calming you down. As a result, this technique significantly improves the quality of sleep."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_SLEEP_PROGRESSIVE_MUSCLE_RELAXATION, "Progressive Muscle Relaxation", "Practise Progressive Muscle Relaxation", "This technique helps to calm your body after a stressful day. Research has shown that it not only reduces the time it takes for you to fall asleep, but also improves the overall quality of your sleep.", "Progressive Muscle Relaxation", arrayList3, R.drawable.muscle_relaxation, "PMR", "This technique helps to calm your body after a stressful day. Research has shown that it not only reduces the time it takes for you to fall asleep, but also improves the overall quality of your sleep."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_SLEEP_GENTLE_MASSAGES, "Guided Massage", "Carry out Guided Massage", "Massage therapy has been found to be highly beneficial for sleep, as it can reduce fatigue and increase the time you spend in the deep, restorative stages of sleep.", "Guided Massage", arrayList3, R.drawable.massage, "Guided Massage", "Massage therapy has been found to be highly beneficial for sleep, as it can reduce fatigue and increase the time you spend in the deep, restorative stages of sleep."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_SLEEP_MINDFUL_WALKING, "Mindful Walking", "Go for a Mindful Walk", "This exercise is an easy way to incorporate mindfulness in your everyday life. It will help you club relaxation with a simple physical activity - which can energise you and boost positive feelings.", "Mindful Walking", arrayList3, R.drawable.ic_mindful_walking, "Mindful Walking", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_SLEEP_THOUGHT_DEFUSION, "Thought Defusion", "Practise Thought Defusion", "In difficult situations, you might get negative thoughts that play on your mind. Using thought defusion, you can become aware of these thoughts. You can then let go of them or change them into positive ones.", "Thought Defusion", arrayList3, R.drawable.ic_thought_deffusion, "Thought Defusion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_SLEEP_SELF_COMPASSION, "Self-Compassion", "Practise Self-Compassion", "You might find it more difficult to be kind to yourself as compared to others around you. Through self-compassion, you can feel more positive and even cope better in difficult situations.", "Self-Compassion", arrayList3, R.drawable.ic_self_compassion, "Self-Compassion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_SLEEP_BEACH_VISUALISATION, "Beach Visualisation", "Practise Beach Visualisation", "This exercise will guide you to imagine a peaceful place, so you can take a mental vacation. It can bring you a sense of calm and peace, and can help you counter feelings of sadness, worry and even stress.", "Beach Visualisation", arrayList3, R.drawable.ic_beach_visualisation, "Beach Visualisation", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_SLEEP_WALKING, "Walking", "Go for a walk", "Regular brisk walking can help you fall asleep faster, be less wakeful at night and get more restful sleep. It functions by boosting the effect of natural sleep hormones in the body.", "Walking", arrayList3, R.drawable.ic_walking, "Walking", "Regular brisk walking can help you fall asleep faster, be less wakeful at night and get more restful sleep. It functions by boosting the effect of natural sleep hormones in the body."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_SLEEP_CLIMBING_STAIRS, "Climbing Stairs", "Climb the stairs", "Climbing the stairs is an easy and convenient way to ensure that you get some form of exercise. Such physical activity can boost the effects of sleep hormones, ensuring you get a good night's rest.", "Climbing Stairs", arrayList3, R.drawable.climbing, "Climbing Stairs", "Climbing the stairs is an easy and convenient way to ensure that you get some form of exercise. Such physical activity can boost the effects of sleep hormones, ensuring you get a good night's rest."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_SLEEP_JOGGING, "Running", "Go for a jog", "Stress caused by negative, worrisome thoughts can prevent you from sleeping well. Running improves sleep by reducing this stress.", "Running", arrayList3, R.drawable.jogging, "Running", "Stress caused by negative, worrisome thoughts can prevent you from sleeping well. Running improves sleep by reducing this stress."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_SLEEP_CYCLING, "Cycling", "Go cycling", "Cycling is beneficial for sleep as it is associated with improved quality of sleep, greater sleep time and reduced time taken to fall asleep.", "Cycling", arrayList3, R.drawable.cycling, "Cycling", "Cycling is beneficial for sleep as it is associated with improved quality of sleep, greater sleep time and reduced time taken to fall asleep."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_SLEEP_SKIPPING_ROPE, "Skipping Rope", "Practise skipping rope", "Skipping can help you sleep better by balancing your body clock, boosting daytime alertness and reducing the time it takes to fall asleep.", "Skipping Rope", arrayList3, R.drawable.skipping, "Skipping Rope", "Skipping can help you sleep better by balancing your body clock, boosting daytime alertness and reducing the time it takes to fall asleep."));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(courseNameIdMap.get(COURSE_DEPRESSION));
        arrayList4.add(COURSE_DEPRESSION);
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_DEPRESSION_DEEP_BREATHING, "Deep Breathing", "Practise Deep Breathing", "Being in control of your breathing can help you feel better. Taking deep breaths can relax your body and mind, allowing you to feel calmer and happier.", "Deep Breathing", arrayList4, R.drawable.deep_breathing, "Deep Breathing", "Engaging in deep breathing when feeling low can serve to reduce feeling of stress, worry and sadness. Being meditative and mindful can help you feel more present, in control, and happy."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY, "Guided Imagery", "Practise Guided Imagery", "Guided Imagery helps you relax and control any negative thoughts that might be making you feel low. Practising this technique on a regular basis can uplift your mood.", "Guided Imagery", arrayList4, R.drawable.guided, "Guided Imagery", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_DEPRESSION_PROGRESSIVE_MUSCLE_RELAXATION, "Progressive Muscle Relaxation", "Practise Progressive Muscle Relaxation", "Progressive Muscle Relaxation is a technique that can instill a sense of control and help you feel calmer. It can also help you sleep better. Thus, this technique can, over time, help you feel better.", "Progressive Muscle Relaxation", arrayList4, R.drawable.muscle_relaxation, "PMR", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_DEPRESSION_GENTLE_MASSAGES, "Guided Massage", "Carry out Guided Massage", "Massage therapy can help ease low mood and sadness by increasing levels of endorphins, your body's feel-good hormones, that create a sense of well-being and make you feel happier.", "Guided Massage", arrayList4, R.drawable.massage, "Guided Massage", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_DEPRESSION_MINDFUL_WALKING, "Mindful Walking", "Go for a Mindful Walk", "This exercise is an easy way to incorporate mindfulness in your everyday life. It will help you club relaxation with a simple physical activity - which can energise you and boost positive feelings.", "Mindful Walking", arrayList4, R.drawable.ic_mindful_walking, "Mindful Walking", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_DEPRESSION_THOUGHT_DEFUSION, "Thought Defusion", "Practise Thought Defusion", "In difficult situations, you might get negative thoughts that play on your mind. Using thought defusion, you can become aware of these thoughts. You can then let go of them or change them into positive ones.", "Thought Defusion", arrayList4, R.drawable.ic_thought_deffusion, "Thought Defusion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_DEPRESSION_SELF_COMPASSION, "Self-Compassion", "Practise Self-Compassion", "You might find it more difficult to be kind to yourself as compared to others around you. Through self-compassion, you can feel more positive and even cope better in difficult situations.", "Self-Compassion", arrayList4, R.drawable.ic_self_compassion, "Self-Compassion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_DEPRESSION_BEACH_VISUALISATION, "Beach Visualisation", "Practise Beach Visualisation", "This exercise will guide you to imagine a peaceful place, so you can take a mental vacation. It can bring you a sense of calm and peace, and can help you counter feelings of sadness, worry and even stress.", "Beach Visualisation", arrayList4, R.drawable.ic_beach_visualisation, "Beach Visualisation", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_WALKING, "Walking", "Go for a walk", "Studies have found that walking for even 20 minutes a day has proven to be effective in reducing the physical symptoms of depression.", "Walking", arrayList4, R.drawable.ic_walking, "Walking", "Studies have found that walking for even 20 minutes a day can make you feel happier."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_CLIMBING_STAIRS, "Climbing Stairs", "Climb the stairs", "Climbing the stairs is an easy way to stay active everyday. Regular exercise is a good way to shift your attention away from negative thoughts and can also boost your mood.", "Climbing Stairs", arrayList4, R.drawable.climbing, "Climbing Stairs", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_JOGGING, "Running", "Go for a jog", "A cardio exercise like running can increase the levels of feel good hormones - endorphins in your brain which can help you feel joyful.", "Running", arrayList4, R.drawable.jogging, "Running", "A cardio exercise like running or jogging can increase the levels of feel good hormones - endorphins - in your brain which can help you feel joyful."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_CYCLING, "Cycling", "Go cycling", "Cycling is an aerobic exercise that can not only create a sense of well-being, but also builds your tolerance to negative life events. It helps by releasing feel good hormones that reduces sadness and increases positive emotions.", "Cycling", arrayList4, R.drawable.cycling, "Cycling", "Cycling is an aerobic exercise that triggers the release of endorphins, which are hormones that have a mood-boosting effect on you. Moreover, cycling can also induce a sense of calm and well-being."));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(courseNameIdMap.get(COURSE_HAPPINESS));
        arrayList5.add(COURSE_HAPPINESS);
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_HAPPINESS_DEEP_BREATHING, "Deep Breathing", "Practise Deep Breathing", "Being in control of your breathing can help you feel better. Taking deep breaths can relax your body and mind, allowing you to feel calmer and happier.", "Deep Breathing", arrayList5, R.drawable.deep_breathing, "Deep Breathing", "Being in control of your breathing can help you feel better. Taking deep breaths can relax your body and mind, allowing you to feel calmer and happier."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_HAPPINESS_GUIDED_IMAGERY, "Guided Imagery", "Practise Guided Imagery", "Guided Imagery helps you relax and control any negative thoughts that might be making you feel unhappy. Practising this technique on a regular basis can uplift your mood.", "Guided Imagery", arrayList5, R.drawable.guided, "Guided Imagery", "Guided Imagery helps you relax and control any negative thoughts that might be making you feel unhappy. Practising this technique on a regular basis can uplift your mood."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_HAPPINESS_PROGRESSIVE_MUSCLE_RELAXATION, "Progressive Muscle Relaxation", "Practise Progressive Muscle Relaxation", "Progressive Muscle Relaxation is a technique that can give you a sense of control over your body, helping you feel calmer. It can also help you sleep better, contributing to greater overall happiness", "Progressive Muscle Relaxation", arrayList5, R.drawable.muscle_relaxation, "PMR", "Progressive Muscle Relaxation is a technique that can give you a sense of control over your body, helping you feel calmer. It can also help you sleep better, contributing to greater overall happiness"));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_HAPPINESS_GENTLE_MASSAGES, "Guided Massage", "Carry out Guided Massage", "Massage therapy can help you tackle sadness by increasing levels of endorphins, your body's feel-good chemicals. This can enhance your sense of well-being and make you happier.", "Guided Massage", arrayList5, R.drawable.massage, "Guided Massage", "Massage therapy can help you tackle sadness by increasing levels of endorphins, your body's feel-good chemicals. This can enhance your sense of well-being and make you happier."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_HAPPINESS_MINDFUL_WALKING, "Mindful Walking", "Go for a Mindful Walk", "This exercise is an easy way to incorporate mindfulness in your everyday life. It will help you club relaxation with a simple physical activity - which can energise you and boost positive feelings.", "Mindful Walking", arrayList5, R.drawable.ic_mindful_walking, "Mindful Walking", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_HAPPINESS_THOUGHT_DEFUSION, "Thought Defusion", "Practise Thought Defusion", "In difficult situations, you might get negative thoughts that play on your mind. Using thought defusion, you can become aware of these thoughts. You can then let go of them or change them into positive ones.", "Thought Defusion", arrayList5, R.drawable.ic_thought_deffusion, "Thought Defusion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_HAPPINESS_SELF_COMPASSION, "Self-Compassion", "Practise Self-Compassion", "You might find it more difficult to be kind to yourself as compared to others around you. Through self-compassion, you can feel more positive and even cope better in difficult situations.", "Self-Compassion", arrayList5, R.drawable.ic_self_compassion, "Self-Compassion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_HAPPINESS_BEACH_VISUALISATION, "Beach Visualisation", "Practise Beach Visualisation", "This exercise will guide you to imagine a peaceful place, so you can take a mental vacation. It can bring you a sense of calm and peace, and can help you counter feelings of sadness, worry and even stress.", "Beach Visualisation", arrayList5, R.drawable.ic_beach_visualisation, "Beach Visualisation", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_HAPPINESS_WALKING, "Walking", "Go for a walk", "Studies have found that walking for even 20 minutes a day can effectively reduce any feelings of sadness and the impact they have on your body - in turn making you happier.", "Walking", arrayList5, R.drawable.ic_walking, "Walking", "Studies have found that walking for even 20 minutes a day can effectively reduce any feelings of sadness and the impact they have on your body - in turn making you happier."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_HAPPINESS_CLIMBING_STAIRS, "Climbing Stairs", "Climb the stairs", "Climbing the stairs is an easy way to stay active every day. Regular exercise is a good way to shift your attention away from negative thoughts and get a good happiness boost.", "Climbing Stairs", arrayList5, R.drawable.climbing, "Climbing Stairs", "Climbing the stairs is an easy way to stay active every day. Regular exercise is a good way to shift your attention away from negative thoughts and get a good happiness boost."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_HAPPINESS_JOGGING, "Running", "Go for a jog", "A cardio exercise like running can increase the levels of feel good hormones - endorphins in your brain which can help you feel joyful.", "Running", arrayList5, R.drawable.jogging, "Running", "A cardio exercise like running can increase the levels of feel good hormones - endorphins in your brain which can help you feel joyful."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_HAPPINESS_CYCLING, "Cycling", "Go cycling", "Cycling is an aerobic exercise that enhances your sense of well-being and builds your tolerance to negative life events. It releases feel-good hormones that can help you feel happy.", "Cycling", arrayList5, R.drawable.cycling, "Cycling", "Cycling is an aerobic exercise that enhances your sense of well-being and builds your tolerance to negative life events. It releases feel-good hormones that can help you feel happy."));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(courseNameIdMap.get(COURSE_ANGER));
        arrayList6.add(COURSE_ANGER);
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_ANGER_DEEP_BREATHING, "Deep Breathing", "Practise Deep Breathing", "Learning how to regulate your breathing can help soothe feelings of anger. It tells your body to relax and calm down. This  helps you think clearly and prevents you from behaving rashly.", "Deep Breathing", arrayList6, R.drawable.deep_breathing, "Deep Breathing", "Engaging in deep breathing when feeling angry can help calm you down. Being meditative and mindful can help you feel more present, in control, and happy."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_ANGER_GUIDED_IMAGERY, "Guided Imagery", "Practise Guided Imagery", "Guided imagery helps you calm down by lowering both blood pressure and levels of stress hormones. Once you feel calmer, you can approach challenges with a clear mind, feeling renewed and recharged.", "Guided Imagery", arrayList6, R.drawable.guided, "Guided Imagery", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_ANGER_PROGRESSIVE_MUSCLE_RELAXATION, "Progressive Muscle Relaxation", "Practise Progressive Muscle Relaxation.", "This technique makes you aware of how your body reacts to anger and helps you calm down instead of feeling stressed. It also helps to prevent any anger you are feeling from getting worse.", "Progressive Muscle Relaxation", arrayList6, R.drawable.muscle_relaxation, "PMR", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_ANGER_GENTLE_MASSAGES, "Guided Massage", "Carry out Guided Massage", "A guided massage can relieve the tension in your muscles caused by feelings of anger. It also helps to reduce stress and make you feel calm.", "Guided Massage", arrayList6, R.drawable.massage, "Guided Massage", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_ANGER_MINDFUL_WALKING, "Mindful Walking", "Go for a Mindful Walk", "This exercise is an easy way to incorporate mindfulness in your everyday life. It will help you club relaxation with a simple physical activity - which can energise you and boost positive feelings.", "Mindful Walking", arrayList6, R.drawable.ic_mindful_walking, "Mindful Walking", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_ANGER_THOUGHT_DEFUSION, "Thought Defusion", "Practise Thought Defusion", "In difficult situations, you might get negative thoughts that play on your mind. Using thought defusion, you can become aware of these thoughts. You can then let go of them or change them into positive ones.", "Thought Defusion", arrayList6, R.drawable.ic_thought_deffusion, "Thought Defusion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_ANGER_SELF_COMPASSION, "Self-Compassion", "Practise Self-Compassion", "You might find it more difficult to be kind to yourself as compared to others around you. Through self-compassion, you can feel more positive and even cope better in difficult situations.", "Self-Compassion", arrayList6, R.drawable.ic_self_compassion, "Self-Compassion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_ANGER_BEACH_VISUALISATION, "Beach Visualisation", "Practise Beach Visualisation", "This exercise will guide you to imagine a peaceful place, so you can take a mental vacation. It can bring you a sense of calm and peace, and can help you counter feelings of sadness, worry and even stress.", "Beach Visualisation", arrayList6, R.drawable.ic_beach_visualisation, "Beach Visualisation", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_WALKING, "Walking", "Go for a walk", "Walking is a physical activity that releases endorphins. This relaxes tense muscles and help you feel calmer.", "Walking", arrayList6, R.drawable.ic_walking, "Walking", "If you're feeling angry, leave the situation and go for a walk. This will help you cool down and think more calmly. Additionally, studies have found that walking for even 20 minutes a day can make you feel happier."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_CLIMBING_STAIRS, "Climbing Stairs", "Climb the stairs", "Climbing the stairs is a physical activity that can be carried out easily. When you climb up and down, your body releases \"feel-good\" hormones which help you feel relaxed and lower feelings of stress.", "Climbing Stairs", arrayList6, R.drawable.climbing, "Climbing Stairs", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_RUNNING, "Running", "Go for a Run", "Running is a good way of releasing your anger if you feel like you might explode. It reduces stress levels by increasing feel good hormones and calms you down.", "Running", arrayList6, R.drawable.ic_jogging, "Running", "Exercising can help you blow off steam and release pent up anger. A cardio exercise like running or jogging can increase the levels of feel good hormones - endorphins - in your brain which can help you feel joyful."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_SKIPPING_ROPE, "Skipping Rope", "Practise skipping rope", "Skipping reduces stress by releasing endorphins which are not only pain relievers, but also create a sense of calm and well-being.", "Skipping Rope", arrayList6, R.drawable.ic_skipping, "Skipping Rope", null));
        ArrayList arrayList7 = new ArrayList();
        if (courseNameIdMap.containsKey(COURSE_WORRY)) {
            arrayList7.add(courseNameIdMap.get(COURSE_WORRY));
        }
        arrayList7.add(COURSE_WORRY);
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_WORRY_DEEP_BREATHING, "Deep Breathing", "Practise Deep Breathing", "If you find yourself feeling breathless when you worry, this technique can not only help you manage your breathing but also help you feel calmer.", "Deep Breathing", arrayList7, R.drawable.deep_breathing, "Deep Breathing", "When you are feeling worried, focussing your attention on your breathing can not only help you feel calmer but can also give you a sense of control."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_WORRY_GUIDED_IMAGERY, "Guided Imagery", "Practise Guided Imagery", "This relaxation technique is helpful in calming a worried mind. It involves shifting your focus to places that you find relaxing in order to feel more relaxed.", "Guided Imagery", arrayList7, R.drawable.ic_guided, "Guided Imagery", "This relaxation technique is helpful in calming a worried mind. It involves shifting, in your mind, your focus to places that you find relaxing. It can be quite powerful in reducing worry."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_WORRY_PROGRESSIVE_MUSCLE_RELAXATION, "Progressive Muscle Relaxation", "Practise Progressive Muscle Relaxation", "Excessive worry can result in muscle tension which is associated with headaches and backaches. Progressive Muscle Relaxation can help you deal with muscle tension and feel calmer.", "Progressive Muscle Relaxation", arrayList7, R.drawable.ic_muscle, "PMR", "Excessive worry can result in muscle tension which is associated with headaches and backaches. Progressive Muscle Relaxation can help you deal with muscle tension, making you feel calmer."));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_WORRY_GENTLE_MASSAGES, "Guided Massage", "Carry out Guided Massage", "A guided massage helps you relax and could help reduce pain and worry.", "Guided Massage", arrayList7, R.drawable.massage, "Guided Massage", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_WORRY_MINDFUL_WALKING, "Mindful Walking", "Go for a Mindful Walk", "This exercise is an easy way to incorporate mindfulness in your everyday life. It will help you club relaxation with a simple physical activity - which can energise you and boost positive feelings.", "Mindful Walking", arrayList7, R.drawable.ic_mindful_walking, "Mindful Walking", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_WORRY_THOUGHT_DEFUSION, "Thought Defusion", "Practise Thought Defusion", "In difficult situations, you might get negative thoughts that play on your mind. Using thought defusion, you can become aware of these thoughts. You can then let go of them or change them into positive ones.", "Thought Defusion", arrayList7, R.drawable.ic_thought_deffusion, "Thought Defusion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_WORRY_SELF_COMPASSION, "Self-Compassion", "Practise Self-Compassion", "You might find it more difficult to be kind to yourself as compared to others around you. Through self-compassion, you can feel more positive and even cope better in difficult situations.", "Self-Compassion", arrayList7, R.drawable.ic_self_compassion, "Self-Compassion", null));
        arrayList.add(new GoalType(GOAL_TYPE_RELAXATION_ACTIVITY, false, ACTIVITY_ID_WORRY_BEACH_VISUALISATION, "Beach Visualisation", "Practise Beach Visualisation", "This exercise will guide you to imagine a peaceful place, so you can take a mental vacation. It can bring you a sense of calm and peace, and can help you counter feelings of sadness, worry and even stress.", "Beach Visualisation", arrayList7, R.drawable.ic_beach_visualisation, "Beach Visualisation", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_WORRY_SKIPPING_ROPE, "Skipping Rope", "Practise skipping rope", "Skipping reduces your worries by releasing endorphins which are not only pain relievers, but also create a sense of calm and well-being.", "Skipping Rope", arrayList7, R.drawable.ic_skipping, "Skipping Rope", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_WORRY_CYCLING, "Cycling", "Go Cycling", "Research shows that cycling reduces the signs of stress (that could be triggered due to excessive worry) and leaves you feeling more calm and focused.", "Cycling", arrayList7, R.drawable.ic_cycling, "Cycling", null));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_WORRY_WALKING, "Walking", "Go For A Walk", "Walking triggers the release of chemicals that relieve pain and make you feel calm. It also manages the stress response which causes a number of the symptoms of worry.", "Walking", arrayList7, R.drawable.ic_walking, "Walking", "Walking triggers the release of chemicals that relieve pain and make you feel calm. It also manages the stress response of your body, thereby reducing the symptoms of worry."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_WORRY_RUNNING, "Running", "Go for a Jog", "Running not only increases feel good chemicals in your brain, its also has calming effects, similar to meditation because of the repetitive motion it requires.", "Running", arrayList7, R.drawable.ic_jogging, "Running", "Running increases feel-good chemicals in your brain. Moreover, it can have calming effects similar to the effects of meditation, essentially because of the repetitive motion running requires."));
        return arrayList;
    }

    public static ArrayList<GoalType> getCopingActivities(String str) {
        ArrayList<GoalType> activities = getActivities(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<GoalType> it = activities.iterator();
        while (it.hasNext()) {
            GoalType next = it.next();
            linkedHashMap.put(next.getGoalId(), next);
        }
        Iterator<GoalType> it2 = getCopingActivities().iterator();
        while (it2.hasNext()) {
            GoalType next2 = it2.next();
            if (next2.getCourseList().contains(str)) {
                linkedHashMap.put(next2.getGoalId(), next2);
            }
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1617042330:
                if (str.equals(COURSE_DEPRESSION)) {
                    c10 = 0;
                    break;
                }
                break;
            case -891989580:
                if (str.equals(COURSE_STRESS)) {
                    c10 = 1;
                    break;
                }
                break;
            case 92960775:
                if (str.equals(COURSE_ANGER)) {
                    c10 = 2;
                    break;
                }
                break;
            case 113319009:
                if (str.equals(COURSE_WORRY)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                linkedHashMap.remove(ACTIVITY_ID_DEPRESSION_CLIMBING_STAIRS);
                linkedHashMap.remove(ACTIVITY_ID_DEPRESSION_GENTLE_MASSAGES);
                linkedHashMap.remove(ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY);
                linkedHashMap.remove(ACTIVITY_ID_DEPRESSION_JOGGING);
                linkedHashMap.remove(ACTIVITY_ID_DEPRESSION_PROGRESSIVE_MUSCLE_RELAXATION);
                break;
            case 1:
                linkedHashMap.remove(ACTIVITY_ID_STRESS_GUIDED_IMAGERY);
                linkedHashMap.remove(ACTIVITY_ID_STRESS_PROGRESSIVE_MUSCLE_RELAXATION);
                linkedHashMap.remove(ACTIVITY_ID_STRESS_GENTLE_MASSAGES);
                linkedHashMap.remove(ACTIVITY_ID_STRESS_JOGGING);
                break;
            case 2:
                linkedHashMap.remove(ACTIVITY_ID_ANGER_GUIDED_IMAGERY);
                linkedHashMap.remove(ACTIVITY_ID_ANGER_GENTLE_MASSAGES);
                linkedHashMap.remove(ACTIVITY_ID_ANGER_PROGRESSIVE_MUSCLE_RELAXATION);
                break;
            case 3:
                linkedHashMap.remove(ACTIVITY_ID_WORRY_GENTLE_MASSAGES);
                linkedHashMap.remove(ACTIVITY_ID_WORRY_SKIPPING_ROPE);
                linkedHashMap.remove(ACTIVITY_ID_WORRY_CYCLING);
                break;
        }
        return new ArrayList<>(linkedHashMap.values());
    }

    public static String getCourseDisplayName(String str) {
        char c10;
        try {
            switch (str.hashCode()) {
                case -2114782937:
                    if (str.equals(COURSE_HAPPINESS)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1617042330:
                    if (str.equals(COURSE_DEPRESSION)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -891989580:
                    if (str.equals(COURSE_STRESS)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -80148009:
                    if (str.equals(COURSE_GENERIC)) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109840:
                    if (str.equals(COURSE_OCD)) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2989151:
                    if (str.equals(COURSE_ADHD)) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 92960775:
                    if (str.equals(COURSE_ANGER)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109522647:
                    if (str.equals(COURSE_SLEEP)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 113319009:
                    if (str.equals(COURSE_WORRY)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 907087443:
                    if (str.equals(LIBRARY_GOAL_COURSE)) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    return COURSE_SLEEP_DN;
                case 1:
                    return COURSE_STRESS_DN;
                case 2:
                    return COURSE_WORRY_DN;
                case 3:
                    return COURSE_DEPRESSION_DN;
                case 4:
                    return COURSE_ANGER_DN;
                case 5:
                    return COURSE_HAPPINESS_DN;
                case 6:
                    return COURSE_ADHD_DN;
                case 7:
                    return COURSE_OCD_DN;
                case '\b':
                    return COURSE_EXPERT_CARE_DN;
                case '\t':
                    return COURSE_LIBRARY_GOAL_DN;
                default:
                    return "";
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("constants", e10);
            return "";
        }
    }

    public static String getCourseName(String str) {
        Iterator<Course> it = FirebasePersistence.getInstance().getCourses().iterator();
        while (it.hasNext()) {
            Course next = it.next();
            if (next.get_id().equals(str)) {
                return next.getCourseName();
            }
        }
        return "";
    }

    public static HashMap<String, String> getCourseNameIdMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<Course> it = FirebasePersistence.getInstance().getCourses().iterator();
        while (it.hasNext()) {
            Course next = it.next();
            hashMap.put(next.getCourseName(), next.get_id());
        }
        return hashMap;
    }

    private static ArrayList<GoalType> getDailyActivities() {
        ArrayList<GoalType> arrayList = new ArrayList<>();
        HashMap<String, String> courseNameIdMap = getCourseNameIdMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(courseNameIdMap.get(COURSE_STRESS));
        arrayList2.add(COURSE_STRESS);
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_STRESS_HAPPY_PLACE, "Visualise your happy place", "Visualise your happy place", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList2, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_STRESS_AFFIRMATIONS, "Practise positive affirmations", "Practise positive affirmations", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList2, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_STRESS_GROUNDING, "Practise grounding", "Practise grounding", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList2, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_STRESS_DOUBLE_STANDARD_DISPUTE, "Double Standard Dispute", "Double Standard Dispute", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList2, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_STRESS_STAGES_OF_PROBLEM_SOLVING, "Stages of Problem Solving", "Stages of Problem Solving", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList2, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_STRESS_ABC_OF_ASSERTIVENESS, "The Assertiveness Formula", "The Assertiveness Formula", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList2, R.drawable.deep_breathing, "", null));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(courseNameIdMap.get(COURSE_SLEEP));
        arrayList3.add(COURSE_SLEEP);
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_SLEEP_HAPPY_PLACE, "Visualise your safe space", "Visualise your safe space", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_SLEEP_AFFIRMATIONS, "Practise positive affirmations", "Practise positive affirmations", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_SLEEP_HUMMING, "Carry out humming meditation", "Carry out humming meditation", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_SLEEP_TOE_TENSING, "Engage in toe tensing", "Engage in toe tensing", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(courseNameIdMap.get(COURSE_WORRY));
        arrayList4.add(COURSE_WORRY);
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_WORRY_HAPPY_PLACE, "Visualise your peaceful place", "Visualise your peaceful place", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_WORRY_AFFIRMATIONS, "Practise acceptance affirmations", "Practise acceptance affirmations", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_WORRY_WORRY_TIME, "Use the worry time technique", "Use the worry time technique", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING_LOWER_BODY, "Practise lower body grounding", "Practise lower body grounding", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION, "Practise Focussed Meditation", "Practise focussed meditation", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING, "5-4-3-2-1 Grounding", "5-4-3-2-1 Grounding", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_SLEEP_WORRY_TIME, "Use the worry time technique", "Use the worry time technique", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(courseNameIdMap.get(COURSE_ANGER));
        arrayList5.add(COURSE_ANGER);
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_ANGER_TIME_OUT, "Take a time out", "Take a time out", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_ANGER_AFFIRMATIONS, "Practise positive affirmations", "Practise positive affirmations", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_ANGER_THREE_MINUTE_BREATHING, "Spend time in your breathing space", "Spend time in your breathing space", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_ANGER_VISUALISATION, "Practise Visualising your safe space", "Visualise your peaceful place", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_ANGER_HELICOPTER_VIEW, "The Helicopter Perspective", "The Helicopter Perspective", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(courseNameIdMap.get(COURSE_DEPRESSION));
        arrayList6.add(COURSE_DEPRESSION);
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_TIME_OUT, "Take a time out", "Take a time out", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_FOCUSSED_MEDITATION, "Practise Focussed Meditation", "Practise focussed meditation", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "Focussed Meditation", "Focussed Meditation"));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THREE_GOOD_THINGS, "Write down 3 good things", "Write down 3 good things", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_POSITIVE_QUALITIES, "Positive Qualities", "Positive Qualities", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW, "3 Good Things", "Write down 3 good things", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW, "Pleasurable Activity", "Increase enjoyment from a fun activity", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW, "Mastery", "Do a mastery activity", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_TIMEOUT_NEW, "Take a time out", "Take an energising break", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW, "Exercises", "Follow your exercise plan", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THOUGHTS_NEW, "Thoughts", "Understanding Thoughts", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_DEPRESSION_DOUBLE_STANDARD_DISPUTE, "Double Standard Dispute", "Double Standard Dispute", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList2, R.drawable.deep_breathing, "", null));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(courseNameIdMap.get(COURSE_HAPPINESS));
        arrayList7.add(COURSE_HAPPINESS);
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_HAPPINESS_AFFIRMATIONS, "Practise positive affirmations", "Practise positive affirmations", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList7, R.drawable.deep_breathing, "", null));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ALTERNATE_BREATHING, "Practise alternate breathing", "Practise alternate breathing", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList7, R.drawable.deep_breathing, "Alternate Breathing", "Alternate Breathing"));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ONE_MINUTE_MINDFULNESS, "Spend a minute being mindful", "Spend a minute being mindful", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList7, R.drawable.deep_breathing, "Alternate Breathing", "Alternate Breathing"));
        arrayList.add(new GoalType(GOAL_TYPE_DAILY_ACTIVITY, true, DAILY_ACTIVITY_GOAL_ID_HAPPINESS_GRATITUDE_AFFIRMATIONS, "Gratitude Affirmations", "Gratitude Affirmations", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList7, R.drawable.deep_breathing, "", null));
        return arrayList;
    }

    public static String getDbEntryPointDomainAreaForCourse(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(COURSE_HAPPINESS)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1617042330:
                if (str.equals(COURSE_DEPRESSION)) {
                    c10 = 1;
                    break;
                }
                break;
            case -891989580:
                if (str.equals(COURSE_STRESS)) {
                    c10 = 2;
                    break;
                }
                break;
            case -80148009:
                if (str.equals(COURSE_GENERIC)) {
                    c10 = 3;
                    break;
                }
                break;
            case 109840:
                if (str.equals(COURSE_OCD)) {
                    c10 = 4;
                    break;
                }
                break;
            case 2989151:
                if (str.equals(COURSE_ADHD)) {
                    c10 = 5;
                    break;
                }
                break;
            case 92960775:
                if (str.equals(COURSE_ANGER)) {
                    c10 = 6;
                    break;
                }
                break;
            case 109522647:
                if (str.equals(COURSE_SLEEP)) {
                    c10 = 7;
                    break;
                }
                break;
            case 113319009:
                if (str.equals(COURSE_WORRY)) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                return "general well-being";
            case 1:
                return COURSE_DEPRESSION;
            case 2:
                return COURSE_STRESS;
            case 4:
                return COURSE_OCD;
            case 5:
                return COURSE_ADHD;
            case 6:
                return COURSE_ANGER;
            case 7:
                return "sleep disturbances";
            case '\b':
                return "anxiety";
            default:
                return "";
        }
    }

    public static ArrayList<GamificationBadgesModel> getGamificationBadges() {
        ArrayList<GamificationBadgesModel> arrayList = new ArrayList<>();
        arrayList.add(new GamificationBadgesModel(REACHED_100_POINTS_BADGE, R.drawable.badge_reached_100_points, "Cheerful Champ", "You get this badge when you earn and collect 100 Happiness Points."));
        arrayList.add(new GamificationBadgesModel(SCHEDULED_AN_ACTIVITY_BADGE, R.drawable.badge_scheduled_an_activity, "Happy Camper", "You get this badge when you schedule an activity from the Recommended Activities section."));
        arrayList.add(new GamificationBadgesModel(SHARE_APP_BADGE, R.drawable.badge_happiness_sharer, "Happiness Sharer", "You get this badge when you share the app with someone in need of self-care."));
        arrayList.add(new GamificationBadgesModel(COMPLETES_ENDURING_GOAL_SECTION_BADGE, R.drawable.badge_completes_enduring_goal_section, "Glee Machine", "You get this badge when you add Happiness Goals from your plan."));
        arrayList.add(new GamificationBadgesModel(TRACKING_YOUR_MOOD_BADGE, R.drawable.badge_tracking_your_mood, "Happiness Maker", "You get this badge for using the specialised tracker 3 days in a row."));
        arrayList.add(new GamificationBadgesModel(HAPPINESS_GO_GETTER_BADGE, R.drawable.badge_happiness_go_getter, "Happiness Go Getter", "You get this badge when you complete the Foundation Course of any programme."));
        arrayList.add(new GamificationBadgesModel(REACHED_500_POINTS_BADGE, R.drawable.badge_reached_500_points, "Happiness Ninja", "You get this badge when you earn and collect 500 Happiness Points."));
        arrayList.add(new GamificationBadgesModel(COMPLETED_THOUGHTS_FLOW_BADGE, R.drawable.badge_completed_thoughts_flow, "Mind Guru", "You get this badge when you learn about thoughts as you go through your plan."));
        arrayList.add(new GamificationBadgesModel(TRACKING_GOALS_FOR_A_WEEK_BADGE, R.drawable.badge_tracking_goals_for_a_week, "Endurance Builder", "You get this badge when you track a goal for a week."));
        arrayList.add(new GamificationBadgesModel(REACHED_1000_POINTS_BADGE, R.drawable.badge_reached_1000_points, "Happiness Maestro", "You get this badge when you earn and collect 1000 Happiness Points."));
        return arrayList;
    }

    public static ArrayList<GamificationBadgesModel> getGamificationBadgesV3() {
        ArrayList<GamificationBadgesModel> arrayList = new ArrayList<>();
        arrayList.add(new GamificationBadgesModel(REACHED_100_POINTS_BADGE, R.drawable.ir_badge_100_points_new, "Cheerful Champ", "You get this badge when you earn and collect 100 Happiness Points."));
        arrayList.add(new GamificationBadgesModel(SCHEDULED_AN_ACTIVITY_BADGE, R.drawable.ir_badge_schedule_activity_new, "Happy Camper", "You get this badge when you schedule an activity from the Recommended Activities section."));
        arrayList.add(new GamificationBadgesModel(SHARE_APP_BADGE, R.drawable.ir_badge_happiness_sharer_new, "Happiness Sharer", "You get this badge when you share the app with someone in need of self-care."));
        arrayList.add(new GamificationBadgesModel(TRACKING_YOUR_MOOD_BADGE, R.drawable.ir_badge_track_mood_new, "Happiness Maker", "You get this badge for using the specialised tracker 3 days in a row."));
        arrayList.add(new GamificationBadgesModel(HAPPINESS_GO_GETTER_BADGE, R.drawable.ir_badge_go_getter_new, "Happiness Go Getter", "You get this badge when you complete the Foundation Course of any programme."));
        arrayList.add(new GamificationBadgesModel(REACHED_500_POINTS_BADGE, R.drawable.ir_badge_500_points_new, "Happiness Ninja", "You get this badge when you earn and collect 500 Happiness Points."));
        arrayList.add(new GamificationBadgesModel(TRACKING_GOALS_FOR_A_WEEK_BADGE, R.drawable.ir_badge_track_goals_week_new, "Endurance Builder", "You get this badge when you track a goal for a week."));
        arrayList.add(new GamificationBadgesModel(REACHED_1000_POINTS_BADGE, R.drawable.ir_badge_1000_points_new, "Happiness Maestro", "You get this badge when you earn and collect 1000 Happiness Points."));
        return arrayList;
    }

    public static String getGoalName(String str) {
        String str2 = "";
        for (GoalType goalType : getGoals()) {
            if (goalType.getGoalId().equals(str)) {
                str2 = goalType.getGoalName();
            }
        }
        return str2;
    }

    public static GoalType getGoalType(String str) {
        for (GoalType goalType : getGoals()) {
            if (goalType.getGoalId().equals(str)) {
                return goalType;
            }
        }
        return null;
    }

    public static List<GoalType> getGoals() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ApplicationPersistence.getInstance().getGoalTypes());
        arrayList.addAll(getActivities());
        arrayList.addAll(getThoughts());
        arrayList.addAll(getCopingActivities());
        arrayList.addAll(getDailyActivities());
        return arrayList;
    }

    public static HashMap<String, GoalType> getGoalsHashMap() {
        HashMap<String, GoalType> hashMap = new HashMap<>();
        for (GoalType goalType : getGoals()) {
            hashMap.put(goalType.getGoalId(), goalType);
        }
        return hashMap;
    }

    public static ArrayList<GratitudeJournalQuestionModel> getGratitudeJournalQuestions() {
        ArrayList<GratitudeJournalQuestionModel> arrayList = new ArrayList<>();
        arrayList.add(new GratitudeJournalQuestionModel("gratitude_1", "List up to 3 things you are thankful for.", R.drawable.ic_gratitude_1));
        arrayList.add(new GratitudeJournalQuestionModel("gratitude_2", "Name 3 people in your life who make you happy.", R.drawable.ic_gratitude_2));
        arrayList.add(new GratitudeJournalQuestionModel("gratitude_3", "Write about a memorable event in your life where you felt happy.", R.drawable.ic_gratitude_3));
        return arrayList;
    }

    public static String getKeyForFirstDay(String str) {
        if (COURSE_SLEEP.equals(str)) {
            return "showPlanFirstScreenSleep";
        }
        if (COURSE_STRESS.equals(str)) {
            return "showPlanFirstScreenStress";
        }
        if (COURSE_WORRY.equals(str)) {
            return "showPlanFirstScreenWorry";
        }
        if (COURSE_ANGER.equals(str)) {
            return "showPlanFirstScreenAnger";
        }
        if (COURSE_HAPPINESS.equals(str)) {
            return "showPlanFirstScreenHappiness";
        }
        if (COURSE_DEPRESSION.equals(str)) {
            return "showPlanFirstScreenDepression";
        }
        return "";
    }

    public static ArrayList<String> getResultLogSlugs() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("result_1");
        arrayList.add("result_3");
        arrayList.add("result_4");
        arrayList.add("result_6");
        arrayList.add("result_9");
        defpackage.d.p(arrayList, "result_10", "result_11", "result_14", "result_16");
        defpackage.d.p(arrayList, "result_21", "result_22", "result_28", "result_30");
        defpackage.d.p(arrayList, "result_32", "result_positive_qualities", "result_gratitude_affirmations", "result_grounding");
        defpackage.d.p(arrayList, "result_goodthings_new", "result_thoughts_new", "result_pleasurable_new", "result_static_three_good_things");
        defpackage.d.p(arrayList, "result_double_standard_dispute_stress", "result_double_standard_dispute_depression", "result_stages_of_problem_solving_stress", "result_abc_of_assertiveness_stress");
        defpackage.c.B(arrayList, "result_helicopter_view_anger", "result_worry_time_anxiety", "result_worry_time_sleep");
        return arrayList;
    }

    public static ArrayList<Testimonial> getTestimonials() {
        Testimonial testimonial = new Testimonial("This is the best free self care app out there. i tried plenty other apps & this is the first one that actually makes me feel better. the visuals are calming plus the activities seem well planned out!", "19/04/2021", "Katelyn");
        Testimonial testimonial2 = new Testimonial("This application is really good, starting from the cute design and colorful, and this application is suitable for me who is emotional and hard to control it. 5 star! 😊", "19/04/2021", "Shafa Nadhira");
        Testimonial testimonial3 = new Testimonial("I mean I feel the improvement in just one day. I did many things for many days but nothing worked until I installed this app. Do use it it'll help you😇", "15/04/2021", "Maha Khan");
        Testimonial testimonial4 = new Testimonial("Very good app. Daily exercises to help wind down and feel good. Ive done some and they really help me. Definetly recommend downloading", "13/01/2021", "Kiaura Brooks");
        Testimonial testimonial5 = new Testimonial("This app helped through soo much, i cant thank the creators enough this app is very helpful. If you are hesitant or think the app wont help DOWLOAD IT, it helped me a lot it will probably help you too.", "03/01/2021", "Raadhike Sharma");
        Testimonial testimonial6 = new Testimonial("I'm so grateful that I could find this app, this app is so interesting and cute with their tools, and we also able get a premium version... Sure I love this app so much, thank u innerHour self care💕💕💕", "01/01/2021", "bunga Bunga");
        ArrayList<Testimonial> arrayList = new ArrayList<>();
        arrayList.add(testimonial);
        arrayList.add(testimonial2);
        arrayList.add(testimonial3);
        arrayList.add(testimonial4);
        arrayList.add(testimonial5);
        arrayList.add(testimonial6);
        return arrayList;
    }

    public static ArrayList<GoalType> getThoughts() {
        ArrayList arrayList = new ArrayList();
        HashMap<String, String> courseNameIdMap = getCourseNameIdMap();
        arrayList.add(courseNameIdMap.get(COURSE_STRESS));
        arrayList.add(COURSE_STRESS);
        ArrayList<GoalType> arrayList2 = new ArrayList<>();
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_MIND_READING, "Mind Reading", "Mind Reading", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_FORTUNE_TELLING, "Fortune Telling", "Fortune Telling", THOUGHTS_FORTUNE_TELLING_TEXT, "Did you think this way today", arrayList, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_BLACK_AND_WHITE_THINKIING, "Black and White Thinking", "Black and White Thinking", THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT, "Did you think this way today", arrayList, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_EMOTIONAL_REASONING, "Emotional Reasoning", "Emotional Reasoning", THOUGHTS_EMOTIONAL_REASONING_TEXT, "Did you think this way today", arrayList, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_CATASTROPHISATION, "Catastrophisation", "Catastrophisation", "Things are always much worse for me than they might seem.", "Did you think this way today", arrayList, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_SHOULD_AND_MUST, "Should's & Must's", "Should's & Must's", "I have clear rules for how things should be and I stick to them.", "Did you think this way today", arrayList, R.drawable.deep_breathing, "", null));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(courseNameIdMap.get(COURSE_DEPRESSION));
        arrayList3.add(COURSE_DEPRESSION);
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_MIND_READING, "Mind Reading", "Mind Reading", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_FORTUNE_TELLING, "Fortune Telling", "Fortune Telling", THOUGHTS_FORTUNE_TELLING_TEXT, "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_EMOTIONAL_REASONING, "Emotional Reasoning", "Emotional Reasoning", THOUGHTS_EMOTIONAL_REASONING_TEXT, "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_SHOULD_AND_MUST, "Should's & Must's", "Should's & Must's", "I have clear rules for how things should be and I stick to them.", "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, "overgeneralisation", "Overgeneralisation", "Overgeneralisation", THOUGHTS_OVERGENERALISATION_TEXT, "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, "discounting-the-positive", "Discounting the Positive", "Discounting the Positive", THOUGHTS_DISCOUNTING_THE_POSITIVE_TEXT, "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, "personalisation", "Personalisation", "Personalisation", THOUGHTS_PERSONALISATION_TEXT, "Did you think this way today", arrayList3, R.drawable.deep_breathing, "", null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(courseNameIdMap.get(COURSE_HAPPINESS));
        arrayList4.add(COURSE_HAPPINESS);
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_MIND_READING, "Mind Reading", "Mind Reading", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_FORTUNE_TELLING, "Fortune Telling", "Fortune Telling", THOUGHTS_FORTUNE_TELLING_TEXT, "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, "personalisation", "Personalisation", "Personalisation", THOUGHTS_PERSONALISATION_TEXT, "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_SHOULD_AND_MUST, "Should's & Must's", "Should's & Must's", "I have clear rules for how things should be and I stick to them.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_BLACK_AND_WHITE_THINKIING, "Black and White Thinking", "Black and White Thinking", THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT, "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, "blaming", "Blaming", "Blaming", "I usually blame situations and people for my problems.", "Did you think this way today", arrayList4, R.drawable.deep_breathing, "", null));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(courseNameIdMap.get(COURSE_WORRY));
        arrayList5.add(COURSE_WORRY);
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_MIND_READING, "Mind Reading", "Mind Reading", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_FORTUNE_TELLING, "Fortune Telling", "Fortune Telling", THOUGHTS_FORTUNE_TELLING_TEXT, "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, "personalisation", "Personalisation", "Personalisation", THOUGHTS_PERSONALISATION_TEXT, "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_SHOULD_AND_MUST, "Should's & Must's", "Should's & Must's", "I have clear rules for how things should be and I stick to them.", "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_BLACK_AND_WHITE_THINKIING, "Black and White Thinking", "Black and White Thinking", THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT, "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_CATASTROPHISATION, "Catastrophisation", "Catastrophisation", "I usually blame situations and people for my problems.", "Did you think this way today", arrayList5, R.drawable.deep_breathing, "", null));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(courseNameIdMap.get(COURSE_ANGER));
        arrayList6.add(COURSE_ANGER);
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_MIND_READING, "Mind Reading", "Mind Reading", "I can usually tell what someone is thinking about me.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_LABELLING, "Labelling", "Labelling", THOUGHTS_ANGER_LABELLING_TEXT, "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, "blaming", "Blaming", "Blaming", "I usually blame situations and people for my problems.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_SHOULD_AND_MUST, "Should's & Must's", "Should's & Must's", "I have clear rules for how things should be and I stick to them.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, "overgeneralisation", "Overgeneralising", "Overgeneralising", THOUGHTS_OVERGENERALISATION_TEXT, "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        arrayList2.add(new GoalType(GOAL_TYPE_THOUGHT, true, THOUGHT_GOAL_ID_CATASTROPHISATION, "Catastrophisation", "Catastrophisation", "I usually blame situations and people for my problems.", "Did you think this way today", arrayList6, R.drawable.deep_breathing, "", null));
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0a84  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ThoughtsModel getThoughtsDistortions(String str, String str2) {
        String str3;
        String str4;
        String str5;
        Object obj;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Object obj2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String courseName = FirebasePersistence.getInstance().getCourseById(defpackage.c.n()).getCourseName();
        ThoughtsModel thoughtsModel = new ThoughtsModel();
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_MIND_READING)) {
            thoughtsModel = new ThoughtsModel();
            thoughtsModel.type = THOUGHTS_WORK;
            thoughtsModel.distortion = THOUGHTS_MIND_READING;
            thoughtsModel.GoalId = THOUGHT_GOAL_ID_MIND_READING;
            thoughtsModel.text1 = "Your colleagues took the stairs while you were waiting for the elevator.";
            thoughtsModel.text2 = "Say this leads to negative thinking pattern - Mind Reading";
            thoughtsModel.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My colleagues hate me.</strong></font>";
            thoughtsModel.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">disappointed and upset.</strong></font>";
            thoughtsModel.text5 = "You and your colleagues had different views on a project recently.";
            thoughtsModel.text6 = "Your colleagues didn't invite you for coffee the last time they went out.";
            thoughtsModel.text7 = "They were inconvenienced when you came in late for a meeting.";
            thoughtsModel.text8 = "Your colleagues greet you everyday.";
            thoughtsModel.text9 = "You are friends with some of your colleagues.";
            thoughtsModel.text10 = "Your colleagues have taken the elevator with you before.";
            thoughtsModel.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Just because my colleagues didn't take the elevator with me, they don't hate me.</strong></font>";
            thoughtsModel.text12 = "You may now start feeling\n<strong><font color=\"#47A8AD\">neutral.</strong></font>";
            thoughtsModel.text13 = "They may have not taken the lift as a lot of other people were waiting in line.";
            thoughtsModel.text14 = "Your colleagues may not have seen you at all.";
            thoughtsModel.text15 = "Your colleagues may prefer climbing the stairs to taking the elevator.";
            if (courseName != null) {
                if (courseName.equals(COURSE_HAPPINESS)) {
                    thoughtsModel.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Just because my colleagues didn't take the elevator with me, doesn't mean they hate me.</strong></font>";
                } else {
                    thoughtsModel.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Just because my colleagues didn't take the elevator with me, they don't hate me.</strong></font>";
                }
            }
            thoughtsModel.text17 = "You may now start feeling\n<strong><font color=\"#47A8AD\">neutral.</strong></font>";
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_FORTUNE_TELLING)) {
            thoughtsModel = new ThoughtsModel();
            thoughtsModel.type = THOUGHTS_WORK;
            thoughtsModel.distortion = THOUGHTS_FORTUNE_TELLING;
            thoughtsModel.GoalId = THOUGHT_GOAL_ID_FORTUNE_TELLING;
            thoughtsModel.text1 = "A meeting is scheduled tomorrow to review your team's performance.";
            thoughtsModel.text2 = "Say this leads to negative thinking pattern - Fortune Telling";
            thoughtsModel.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">The meeting will not go well.</strong></font>";
            thoughtsModel.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">sad and anxious.</strong></font>";
            thoughtsModel.text5 = "The previous meeting did not go very well.";
            thoughtsModel.text6 = "You don't feel as well prepared as you would like.";
            thoughtsModel.text7 = "Your manager spotted an error in your report.";
            thoughtsModel.text8 = "Your team has worked well this time.";
            thoughtsModel.text9 = "You have reviewed and corrected the errors in your report.";
            thoughtsModel.text10 = "Your team members are better prepared for the meeting this time.";
            thoughtsModel.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">I cannot predict the outcome of the meeting. I will give it my best.</strong></font>";
            thoughtsModel.text12 = "You may now feel more\n<strong><font color=\"#47A8AD\">confident.</strong></font>";
            thoughtsModel.text13 = "Your team has performed well and is better prepared for this review.";
            thoughtsModel.text14 = "The last meeting not going well doesn't mean that this one will go badly too.";
            thoughtsModel.text15 = "Worrying about the situation is more likely to hurt than help you.";
            thoughtsModel.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I cannot predict the outcome of the meeting. I will give it my best.</strong></font>";
            thoughtsModel.text17 = "You may now feel more\n<strong><font color=\"#47A8AD\">confident.</strong></font>";
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_BLACK_AND_WHITE_THINKIING)) {
            thoughtsModel = new ThoughtsModel();
            thoughtsModel.type = THOUGHTS_WORK;
            thoughtsModel.distortion = THOUGHTS_BLACK_AND_WHITE_THINKIING;
            thoughtsModel.GoalId = THOUGHT_GOAL_ID_BLACK_AND_WHITE_THINKIING;
            thoughtsModel.text1 = "Your boss said that they have been very lenient with appraisals this year.";
            thoughtsModel.text2 = "Say this leads to negative thinking pattern - Black and White Thinking";
            thoughtsModel.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">If I do not get the best appraisal, I am the worst employee ever.</strong></font>";
            thoughtsModel.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">anxious and dejected.</strong></font>";
            thoughtsModel.text5 = "In your previous appraisal, you received mixed feedback.";
            thoughtsModel.text6 = "Some of your colleagues recently gave you negative feedback about your work.";
            if (courseName != null) {
                if (!courseName.equals(COURSE_WORRY) && !courseName.equals(COURSE_HAPPINESS)) {
                    thoughtsModel.text7 = "On several occassions, your boss has appreciated your work ethic and expertise.";
                } else {
                    thoughtsModel.text7 = "In a recent meeting, your junior's opinion was valued more than yours.";
                }
            }
            thoughtsModel.text8 = "You have worked well this year and have improved your performance.";
            thoughtsModel.text9 = "Your colleagues who have performed poorly one year have still grown over time.";
            if (!courseName.equals(COURSE_WORRY) && !courseName.equals(COURSE_HAPPINESS)) {
                thoughtsModel.text10 = "Your team members are better prepared for the meeting this time.";
            } else {
                thoughtsModel.text10 = "On several occassions, your boss has appreciated your work ethic and expertise.";
            }
            thoughtsModel.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Even if I do not receive the best appraisal, I am still a good employee.</strong></font>";
            thoughtsModel.text12 = "You might start feeling\n<strong><font color=\"#47A8AD\">confident and secure.</strong></font>";
            thoughtsModel.text13 = "You may not get the best appraisal but you are likely to get a good one.";
            thoughtsModel.text14 = "Not receiving the best appraisal does not make you the worst employee.";
            thoughtsModel.text15 = "Even if your appraisal is not as you expect, you will have opportunities ahead.";
            thoughtsModel.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Even if I do not receive the best appraisal, I am still a good employee.</strong></font>";
            thoughtsModel.text17 = "You might start feeling\n<strong><font color=\"#47A8AD\">confident and secure.</strong></font>";
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_EMOTIONAL_REASONING)) {
            thoughtsModel = new ThoughtsModel();
            thoughtsModel.type = THOUGHTS_WORK;
            thoughtsModel.distortion = THOUGHTS_EMOTIONAL_REASONING;
            thoughtsModel.GoalId = THOUGHT_GOAL_ID_EMOTIONAL_REASONING;
            thoughtsModel.text1 = "You have to work overtime today, and there is no one in your team to assist you.";
            thoughtsModel.text2 = "Say this leads to negative thinking pattern - Emotional Reasoning";
            thoughtsModel.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I feel upset. My colleagues must be treating me unfairly..</strong></font>";
            thoughtsModel.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">resentful and angry.</strong></font>";
            thoughtsModel.text5 = "You sometimes have arguments with your colleagues.";
            thoughtsModel.text6 = "This is the second time this week that you've had to stay back late.";
            thoughtsModel.text7 = "For the past month you have been assigned more work than others.";
            thoughtsModel.text8 = "Before this week, you've rarely had to stay back beyond your working hours.";
            thoughtsModel.text9 = "Your colleagues have always agreed to help you when you've asked for it.";
            thoughtsModel.text10 = "Others too have had to stay beyond working hours sometimes.";
            thoughtsModel.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">I'm angry because I am overworked; that does not mean I'm being treated unfairly.</strong></font>";
            thoughtsModel.text12 = "You may now feel\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel.text13 = "Perhaps you are the only one in your team who can complete the task at hand.";
            thoughtsModel.text14 = "You are under a lot of pressure, and you may get irritated when stressed.";
            thoughtsModel.text15 = "Your colleagues would have stayed back to help if they could have.";
            thoughtsModel.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I'm angry because I am overworked; that does not mean I'm being treated unfairly.</strong></font>";
            thoughtsModel.text17 = "You may now feel\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_CATASTROPHISATION)) {
            thoughtsModel = new ThoughtsModel();
            thoughtsModel.type = THOUGHTS_WORK;
            thoughtsModel.distortion = THOUGHTS_CATASTROPHISATION;
            thoughtsModel.GoalId = THOUGHT_GOAL_ID_CATASTROPHISATION;
            thoughtsModel.text1 = "You were reviewing a report you have to submit, and you found an error in it.";
            thoughtsModel.text2 = "Say this leads to negative thinking pattern - Catastrophisation";
            thoughtsModel.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I will never finish this report. It will be full of mistakes and I'll be fired.</strong></font>";
            thoughtsModel.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">anxious and worried.</strong></font>";
            thoughtsModel.text5 = "Your superiors are strict regarding deadlines for important reports.";
            thoughtsModel.text6 = "You have seen other colleagues being pulled up for errors in reports.";
            thoughtsModel.text7 = "In your last report, when you found one mistake, you found another one later.";
            thoughtsModel.text8 = "No one has been fired over a single error in a report.";
            thoughtsModel.text9 = "You have made errors before and corrected them well in time.";
            thoughtsModel.text10 = "Many of your reports have been accurate and well received.";
            thoughtsModel.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Making a mistake is acceptable. It does not mean that the worst will happen.</strong></font>";
            thoughtsModel.text12 = "You may now feel\n<strong><font color=\"#47A8AD\">calm and positive.</strong></font>";
            str3 = THOUGHTS_CATASTROPHISATION;
            thoughtsModel.text13 = "Finding one mistake does not necessarily mean that others will follow. ";
            thoughtsModel.text14 = "Submitting the report slightly late does not guarantee that you will be fired.";
            thoughtsModel.text15 = "Your superiors might be strict, but they are also reasonable.";
            thoughtsModel.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Making a mistake is acceptable. It does not mean that the worst will happen.</strong></font>";
            thoughtsModel.text17 = "You may now feel\n<strong><font color=\"#47A8AD\">calm and positive.</strong></font>";
        } else {
            str3 = THOUGHTS_CATASTROPHISATION;
        }
        ThoughtsModel thoughtsModel2 = thoughtsModel;
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_SHOULD_AND_MUST)) {
            ThoughtsModel thoughtsModel3 = new ThoughtsModel();
            thoughtsModel3.type = THOUGHTS_WORK;
            thoughtsModel3.distortion = THOUGHTS_SHOULD_AND_MUST;
            thoughtsModel3.GoalId = THOUGHT_GOAL_ID_SHOULD_AND_MUST;
            str5 = THOUGHTS_SHOULD_AND_MUST;
            thoughtsModel3.text1 = "You have two projects to work on, and your boss just assigned more work to you.";
            thoughtsModel3.text2 = "Say this leads to negative thinking pattern - Should's & Must's";
            thoughtsModel3.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I must keep working, no matter how tired I am.</strong></font>";
            thoughtsModel3.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">tired and upset.</strong></font>";
            thoughtsModel3.text5 = "You have seen your colleagues taking up additional projects.";
            thoughtsModel3.text6 = "Your boss specifically asked you to do this work.";
            thoughtsModel3.text7 = "In the past, even when tired, you have mostly worked hard.";
            thoughtsModel3.text8 = "When you are tired you take longer to get things done.";
            thoughtsModel3.text9 = "Working non-stop has affected not only your health, but your work quality too.";
            thoughtsModel3.text10 = "Taking breaks has sometimes helped you work better.";
            thoughtsModel3.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">I will work hard, but I'll also take some time off to enhance my output.</strong></font>";
            thoughtsModel3.text12 = "You may start feeling\n<strong><font color=\"#47A8AD\">refreshed and positive.</strong></font>";
            str4 = THOUGHTS_BLACK_AND_WHITE_THINKIING;
            thoughtsModel3.text13 = "Taking a break could improve your productivity instead of decreasing it.";
            thoughtsModel3.text14 = "Your boss may understand that you need more time, so you could ask for the same.";
            thoughtsModel3.text15 = "It's okay to take breaks when you are tired and unable to work productively.";
            thoughtsModel3.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I will work hard, but I'll also take some time off to enhance my output.</strong></font>";
            thoughtsModel3.text17 = "You may start feeling\n<strong><font color=\"#47A8AD\">refreshed and positive.</strong></font>";
            thoughtsModel2 = thoughtsModel3;
        } else {
            str4 = THOUGHTS_BLACK_AND_WHITE_THINKIING;
            str5 = THOUGHTS_SHOULD_AND_MUST;
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals("overgeneralisation")) {
            ThoughtsModel thoughtsModel4 = new ThoughtsModel();
            thoughtsModel4.type = THOUGHTS_WORK;
            thoughtsModel4.distortion = "overgeneralisation";
            thoughtsModel4.GoalId = "overgeneralisation";
            str6 = "overgeneralisation";
            thoughtsModel4.text1 = "All your work on a document had to be redone because the approach was changed.";
            thoughtsModel4.text2 = "Say this leads to negative thinking pattern - Overgeneralisation";
            thoughtsModel4.text3 = "You might think<br><strong><font color=\"#47A8AD\">My work always goes to waste.</strong></font>";
            if (courseName != null && courseName.equals(COURSE_ANGER)) {
                str17 = " angry and resentful.";
            } else {
                str17 = " depressed.";
            }
            obj = COURSE_HAPPINESS;
            thoughtsModel4.text4 = defpackage.b.m("You may feel<br><strong><font color=\"#47A8AD\">", str17, "</strong></font>");
            thoughtsModel4.text5 = "None of the previous work could be used because of the change in approach.";
            thoughtsModel4.text6 = "Your colleague's work was not edited.";
            thoughtsModel4.text7 = "Your inputs weren't considered before making the changes.";
            thoughtsModel4.text8 = "Your manager appreciated the work you had done.";
            thoughtsModel4.text9 = "Your work has rarely been redone before.";
            thoughtsModel4.text10 = "The client made a last minute unexpected request for the change.";
            thoughtsModel4.text11 = "You might now think<br><strong><font color=\"#33b5e5\">My work had to be redone this time for a reason; this is not the case always.</strong></font>";
            thoughtsModel4.text12 = "You may now start to feel <strong><font color=\"#47A8AD\">neutral.</strong></font>";
            thoughtsModel4.text13 = "There could be a valid reason for changing the document last minute.";
            thoughtsModel4.text14 = "The new approach might actually help you structure your document better.";
            thoughtsModel4.text15 = "Your work could be used at a later time, on another relevant project.";
            thoughtsModel4.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My work had to be redone this time for a reason; this is not the case always.</strong></font>";
            thoughtsModel4.text17 = "You may now start to feel <strong><font color=\"#47A8AD\">neutral.</strong></font>";
            thoughtsModel2 = thoughtsModel4;
        } else {
            obj = COURSE_HAPPINESS;
            str6 = "overgeneralisation";
        }
        if (!str.equals(THOUGHTS_WORK) || !str2.equals("discounting-the-positive")) {
            str7 = "discounting-the-positive";
        } else {
            ThoughtsModel thoughtsModel5 = new ThoughtsModel();
            thoughtsModel5.type = THOUGHTS_WORK;
            thoughtsModel5.distortion = "discounting-the-positive";
            thoughtsModel5.GoalId = "discounting-the-positive";
            thoughtsModel5.text1 = "You made four suggestions during the team meeting, two of which were taken.";
            thoughtsModel5.text2 = "Say this leads to negative thinking pattern - Discounting the Positive";
            thoughtsModel5.text3 = "You might think<br><strong><font color=\"#47A8AD\">My team leader does not value my input.</strong></font>";
            thoughtsModel5.text4 = "You may feel<br><strong><font color=\"#47A8AD\"> disappointed</strong></font>";
            thoughtsModel5.text5 = "Your team leader took suggestions from everyone.";
            thoughtsModel5.text6 = "All your suggestions were not accepted the last time either.";
            thoughtsModel5.text7 = "Your team leader did not ask you for more suggestions than the ones you gave.";
            thoughtsModel5.text8 = "Two of your suggestions were picked up, and the other two were noted for the future.";
            thoughtsModel5.text9 = "Your team leader appreciated all your suggestions.";
            thoughtsModel5.text10 = "Everyone in the team had at least a few suggestions rejected.";
            thoughtsModel5.text11 = "You might now think<br><strong><font color=\"#33b5e5\">Two of my suggestions were accepted. This means that my input is valued.</strong></font>";
            thoughtsModel5.text12 = "You may now start to feel <strong><font color=\"#47A8AD\">happy.</strong></font>";
            str7 = "discounting-the-positive";
            thoughtsModel5.text13 = "Some of the other suggestions picked up may have been more relevant than yours.";
            thoughtsModel5.text14 = "Not choosing two of your suggestions doesn't mean that your input is not valued.";
            thoughtsModel5.text15 = "Maybe your other two suggestions could be used in the future.";
            thoughtsModel5.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Two of my suggestions were accepted. This means that my input is valued.</strong></font>";
            thoughtsModel5.text17 = "You may now start to feel <strong><font color=\"#47A8AD\">happy.</strong></font>";
            thoughtsModel2 = thoughtsModel5;
        }
        if (!str.equals(THOUGHTS_WORK) || !str2.equals("personalisation")) {
            str8 = "personalisation";
        } else {
            ThoughtsModel thoughtsModel6 = new ThoughtsModel();
            thoughtsModel6.type = THOUGHTS_WORK;
            thoughtsModel6.distortion = "personalisation";
            thoughtsModel6.GoalId = "personalisation";
            thoughtsModel6.text1 = "Your colleague received a poor appraisal after being very stressed at work.";
            thoughtsModel6.text2 = "Say this leads to negative thinking pattern - Personalisation";
            thoughtsModel6.text3 = "You might think<br><strong><font color=\"#47A8AD\">If I had helped my colleague more, they would've received a better appraisal.</strong></font>";
            thoughtsModel6.text4 = "You may feel<br><strong><font color=\"#47A8AD\">sad and guilty.</strong></font>";
            thoughtsModel6.text5 = "Your colleague had often asked you for help over the past few months.";
            thoughtsModel6.text6 = "You once helped a colleague with a project, post which they got a good appraisal.";
            thoughtsModel6.text7 = "You were busy with your own assignments and could not assist them every single time.";
            thoughtsModel6.text8 = "You had helped your colleague whenever possible.";
            thoughtsModel6.text9 = "Your colleague had not been performing well for quite some time.";
            thoughtsModel6.text10 = "Even after your help, your colleague had made mistakes on the last project.";
            thoughtsModel6.text11 = "You might now think<br><strong><font color=\"#33b5e5\">I did my best to help my colleague, but their performance determines their appraisal.</strong></font>";
            thoughtsModel6.text12 = "You may now feel <strong><font color=\"#47A8AD\">less guilty or neutral.</strong></font>";
            str8 = "personalisation";
            thoughtsModel6.text13 = "The appraisal was difficult for many in the office.";
            thoughtsModel6.text14 = "Despite your help, your colleague had been struggling to perform.";
            thoughtsModel6.text15 = "There could be several reasons why your colleague receieved a poor appraisal.";
            thoughtsModel6.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I did my best to help my colleague, but their performance determines their appraisal.</strong></font>";
            thoughtsModel6.text17 = "You may now feel <strong><font color=\"#47A8AD\">less guilty or neutral.</strong></font>";
            thoughtsModel2 = thoughtsModel6;
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals("blaming")) {
            ThoughtsModel thoughtsModel7 = new ThoughtsModel();
            thoughtsModel7.type = THOUGHTS_WORK;
            thoughtsModel7.distortion = "blaming";
            thoughtsModel7.GoalId = "blaming";
            thoughtsModel7.text1 = "You are expecting to receive a promotion, but you don't get it.";
            thoughtsModel7.text2 = "Say this leads to negative thinking pattern - Blaming";
            thoughtsModel7.text3 = "You might think<br><strong><font color=\"#47A8AD\">My manager is responsible for this. He does not want me to grow at work.</strong></font>";
            thoughtsModel7.text4 = "You may feel<br><strong><font color=\"#47A8AD\"> Angry.</strong></font>";
            thoughtsModel7.text5 = "Your manager has an important role in deciding on promotions.";
            thoughtsModel7.text6 = "You recently had a disagreement with your manager.";
            thoughtsModel7.text7 = "Your colleague, who has a different manager, got a promotion.";
            thoughtsModel7.text8 = "Your manager is not the only person who makes the decision.";
            thoughtsModel7.text9 = "Your boss had told you that your performance was not as expected this year.";
            thoughtsModel7.text10 = "You have known the apprasial system at your workplace to be fair.";
            thoughtsModel7.text11 = "You might now think<br><strong><font color=\"#33b5e5\">I am responsible for my own performance. I will work harder to improve it.</strong></font>";
            thoughtsModel7.text12 = "You might start feeling <strong><font color=\"#47A8AD\">Calm and satisfied</strong></font>";
            thoughtsModel7.text13 = "There may have been several reasons that prevented you from getting a promotion.";
            thoughtsModel7.text14 = "Your manager may not have had much of a say with respect to your promotion.";
            thoughtsModel7.text15 = "The feedback you have received may help you improve your performance at work.";
            thoughtsModel7.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I am responsible for my own performance. I will work harder to improve it.</strong></font>";
            thoughtsModel7.text17 = "You might start feeling <strong><font color=\"#47A8AD\">Calm and satisfied</strong></font>";
            thoughtsModel2 = thoughtsModel7;
        }
        if (!str.equals(THOUGHTS_WORK) || !str2.equals(THOUGHTS_WORRY_MIND_READING)) {
            str9 = "</strong></font>";
            str10 = THOUGHTS_WORRY_MIND_READING;
        } else {
            ThoughtsModel thoughtsModel8 = new ThoughtsModel();
            thoughtsModel8.type = THOUGHTS_WORK;
            thoughtsModel8.distortion = THOUGHTS_WORRY_MIND_READING;
            thoughtsModel8.GoalId = THOUGHT_GOAL_ID_MIND_READING;
            str10 = THOUGHTS_WORRY_MIND_READING;
            thoughtsModel8.text1 = "Your supervisor returned your report, saying it was not good enough.";
            thoughtsModel8.text2 = "Say this leads to negative thinking pattern - Mind Reading";
            thoughtsModel8.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My supervisor hates me.</strong></font>";
            thoughtsModel8.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">disappointed and upset.</strong></font>";
            thoughtsModel8.text5 = "Your supervisor had returned your previous report too.";
            thoughtsModel8.text6 = "Your supervisor has never returned your colleague's reports to him.";
            thoughtsModel8.text7 = "Your last report submission was delayed, and your supervisor was upset with you.";
            thoughtsModel8.text8 = "There were obvious mistakes in your last report, which needed correction.";
            thoughtsModel8.text9 = "Your supervisor is known to be particular about reports.";
            thoughtsModel8.text10 = "You have received positive feedback from your supervisor a few times.";
            thoughtsModel8.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">My supervisor returned the report to help me improve, not because he hates me.</strong></font>";
            thoughtsModel8.text12 = "You may now start feeling\n<strong><font color=\"#47A8AD\">neutral.</strong></font>";
            str9 = "</strong></font>";
            thoughtsModel8.text13 = "Getting feedback from your supervisor may help you improve your report.";
            thoughtsModel8.text14 = "Your supervisor might have felt that you can do better.";
            thoughtsModel8.text15 = "You might learn a lot from the feedback.";
            thoughtsModel8.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My supervisor returned the report to help me improve, not because he hates me.</strong></font>";
            thoughtsModel8.text17 = "You may now start feeling\n<strong><font color=\"#47A8AD\">neutral.</strong></font>";
            thoughtsModel2 = thoughtsModel8;
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_ANGER_MIND_READING)) {
            ThoughtsModel thoughtsModel9 = new ThoughtsModel();
            thoughtsModel9.type = THOUGHTS_WORK;
            thoughtsModel9.distortion = THOUGHTS_ANGER_MIND_READING;
            thoughtsModel9.GoalId = THOUGHT_GOAL_ID_MIND_READING;
            thoughtsModel9.text1 = "Your supervisor returned your report, saying it was not good enough.";
            thoughtsModel9.text2 = "Say this leads to negative thinking pattern - Mind Reading";
            thoughtsModel9.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My supervisor hates me, and is trying to irritate me on purpose.</strong></font>";
            thoughtsModel9.text4 = "You might feel\n<br><strong><font color=\"#47A8AD\">angry.</strong></font>";
            thoughtsModel9.text5 = "Your supervisor had returned your previous report too.";
            thoughtsModel9.text6 = "Your supervisor has never returned your colleague's reports to him.";
            thoughtsModel9.text7 = "Your last report submission was delayed, and your supervisor was upset with you.";
            thoughtsModel9.text8 = "There were obvious mistakes in your last report, which needed correction.";
            thoughtsModel9.text9 = "Your supervisor is known to be particular about reports.";
            thoughtsModel9.text10 = "You have received positive feedback from your supervisor a few times.";
            thoughtsModel9.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">My supervisor is not trying to irritate me, but is helping me improve my report.</strong></font>";
            thoughtsModel9.text12 = "You might now start feeling \n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            str11 = courseName;
            thoughtsModel9.text13 = "Getting feedback from your supervisor may help you improve your report.";
            thoughtsModel9.text14 = "Your supervisor might have returned the report as they felt that you can do better.";
            thoughtsModel9.text15 = "You might learn a lot from the feedback and do better next time.";
            thoughtsModel9.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My supervisor is not trying to irritate me, but is helping me improve my report.</strong></font>";
            thoughtsModel9.text17 = "You might now start feeling \n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel2 = thoughtsModel9;
        } else {
            str11 = courseName;
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_ANGER_LABELLING)) {
            ThoughtsModel thoughtsModel10 = new ThoughtsModel();
            thoughtsModel10.type = THOUGHTS_WORK;
            thoughtsModel10.distortion = THOUGHTS_ANGER_LABELLING;
            thoughtsModel10.GoalId = THOUGHT_GOAL_ID_LABELLING;
            thoughtsModel10.text1 = "While you are stuck in a meeting, your colleagues go ahead to have their lunch.";
            thoughtsModel10.text2 = "Say this leads to negative thinking pattern - Labelling";
            thoughtsModel10.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My colleagues didn't wait for me. They are mean.</strong></font>";
            thoughtsModel10.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">angry and upset.</strong></font>";
            thoughtsModel10.text5 = "You try waiting for your colleagues for lunch as far as possible.";
            thoughtsModel10.text6 = "You had told your colleagues that you wanted to have lunch with them.";
            thoughtsModel10.text7 = "Your colleagues did not even send a message to you that they were going ahead.";
            thoughtsModel10.text8 = "Your colleagues had meetings immediately after lunch - so they had to rush.";
            thoughtsModel10.text9 = "Your colleagues greet you everyday, and also go for outings with you.";
            thoughtsModel10.text10 = "Your colleagues have invited you for lunch several times.";
            thoughtsModel10.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Just because they didn't wait for me once, doesn't mean my colleagues are mean.</strong></font>";
            thoughtsModel10.text12 = "You may start feeling \n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel10.text13 = "Your colleagues may have waited for a while, but may have been very hungry.";
            thoughtsModel10.text14 = "Your colleagues may not have known how long your meeting would take.";
            thoughtsModel10.text15 = "It's okay for your colleagues to have  lunch without you sometimes.";
            thoughtsModel10.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Just because they didn't wait for me once, doesn't mean my colleagues are mean.</strong></font>";
            thoughtsModel10.text17 = "You may start feeling \n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel2 = thoughtsModel10;
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_ANGER_BLAMING)) {
            ThoughtsModel thoughtsModel11 = new ThoughtsModel();
            thoughtsModel11.type = THOUGHTS_WORK;
            thoughtsModel11.distortion = THOUGHTS_ANGER_BLAMING;
            thoughtsModel11.GoalId = "blaming";
            thoughtsModel11.text1 = "You have been expecting to receive a promotion at work, but don't get it.";
            thoughtsModel11.text2 = "Say this leads to negative thinking pattern - Blaming";
            thoughtsModel11.text3 = "You might think<br><strong><font color=\"#47A8AD\">My manger is responsible for this. He does not want me to grow in my job.</strong></font>";
            thoughtsModel11.text4 = "You may start feeling <br><strong><font color=\"#47A8AD\">angry.</strong></font>";
            thoughtsModel11.text5 = "Your manager has an important role in deciding on promotions.";
            thoughtsModel11.text6 = "You recently had a disagreement with your manager.";
            thoughtsModel11.text7 = "Your colleague, who has a different manager, got a promotion.";
            thoughtsModel11.text8 = "Your manager is not the only person who makes the decision.";
            thoughtsModel11.text9 = "Your boss had told you that your performance was not as expected this year.";
            thoughtsModel11.text10 = "You are aware that you have not done your best this year.";
            thoughtsModel11.text11 = "You might now think<br><strong><font color=\"#33b5e5\">I am responsible for my own performance. I will work harder to improve it.</strong></font>";
            thoughtsModel11.text12 = "You may start feeling <strong><font color=\"#47A8AD\">calm and determined.</strong></font>";
            thoughtsModel11.text13 = "Your manager may have given you a relatively good and reasonable appraisal.";
            thoughtsModel11.text14 = "Other people in your team may have done better than you.";
            thoughtsModel11.text15 = "The feedback you have received may help you improve your performance at work.";
            thoughtsModel11.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I am responsible for my own performance. I will work harder to improve it.</strong></font>";
            thoughtsModel11.text17 = "You may start feeling <strong><font color=\"#47A8AD\">calm and determined.</strong></font>";
            thoughtsModel2 = thoughtsModel11;
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_ANGER_CATASTROPHISATION)) {
            ThoughtsModel thoughtsModel12 = new ThoughtsModel();
            thoughtsModel12.type = THOUGHTS_WORK;
            thoughtsModel12.distortion = THOUGHTS_ANGER_CATASTROPHISATION;
            thoughtsModel12.GoalId = THOUGHT_GOAL_ID_CATASTROPHISATION;
            thoughtsModel12.text1 = "Your junior made a mistake during an important presentation.";
            thoughtsModel12.text2 = "Say this leads to negative thinking pattern - Catastrophisation";
            thoughtsModel12.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I will be blamed for the error made by my junior and will end up losing my job.</strong></font>";
            thoughtsModel12.text4 = "You might feel\n<br><strong><font color=\"#47A8AD\">angry.</strong></font>";
            thoughtsModel12.text5 = "Your boss had repeatedly told you that this presentation was important.";
            thoughtsModel12.text6 = "You have seen the team leader being blamed for mistakes made by juniors before.";
            thoughtsModel12.text7 = "Your boss looked upset and left immediately after the presentation.";
            thoughtsModel12.text8 = "It was a minor error that your junior realised and corrected immediately.";
            thoughtsModel12.text9 = "Your boss has always been reasonable in his assessments.";
            thoughtsModel12.text10 = "You received positive feedback from others about your presentation.";
            thoughtsModel12.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">A single error made by your junior is not enough reason for you to get fired.</strong></font>";
            thoughtsModel12.text12 = "You may now start feeling\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel12.text13 = "Others may not have noticed the small error made by your junior.";
            thoughtsModel12.text14 = "You may not get blamed for the error; people may instead acknowledge your effort.";
            thoughtsModel12.text15 = "A single error made by your junior is not enough reason for you to get fired.";
            thoughtsModel12.text16 = "You might now think\n<strong><font color=\"#33b5e5\">A mistake was made, but that does not mean that I will be fired for it.</strong></font>";
            thoughtsModel12.text17 = "You may now start feeling\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel2 = thoughtsModel12;
        }
        if (str.equals(THOUGHTS_WORK) && str2.equals(THOUGHTS_ANGER_SHOULD_AND_MUST)) {
            ThoughtsModel thoughtsModel13 = new ThoughtsModel();
            thoughtsModel13.type = THOUGHTS_WORK;
            thoughtsModel13.distortion = THOUGHTS_ANGER_SHOULD_AND_MUST;
            thoughtsModel13.GoalId = THOUGHT_GOAL_ID_SHOULD_AND_MUST;
            thoughtsModel13.text1 = "Your colleague arrived late for a meeting, and your company lost the deal.";
            thoughtsModel13.text2 = "Say this leads to negative thinking pattern - Should's & Must's";
            thoughtsModel13.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">He should not have been late. He made us all look bad.</strong></font>";
            thoughtsModel13.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">angry.</strong></font>";
            thoughtsModel13.text5 = "Your boss looked disappointed when he walked in late.";
            thoughtsModel13.text6 = "One of your colleagues received a poor appraisal for coming in late frequently.";
            thoughtsModel13.text7 = "The meeting started late because everyone was waiting for your colleague.";
            thoughtsModel13.text8 = "You had been late to a meeting once, but your company did not lose the deal.";
            thoughtsModel13.text9 = "Your colleague is usually on time for meetings.";
            thoughtsModel13.text10 = "The client didn't seem upset at the delay.";
            thoughtsModel13.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">It is unfortunate that my colleague came in late, but it is also understandable.</strong></font>";
            thoughtsModel13.text12 = "You may now feel\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel13.text13 = "Just because your colleague came late, doesn't mean he made you all look bad.";
            thoughtsModel13.text14 = "Your colleague might have had a genuine reason for being late.";
            thoughtsModel13.text15 = "The client may have put off the deal because they did not like the offer.";
            thoughtsModel13.text16 = "You might now think\n<strong><font color=\"#33b5e5\">It is unfortunate that my colleague came in late, but it is also understandable.</strong></font>";
            thoughtsModel13.text17 = "You may now feel\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel2 = thoughtsModel13;
        }
        if (str.equals(THOUGHTS_RELATIONSHIP) && str2.equals(THOUGHTS_MIND_READING)) {
            ThoughtsModel thoughtsModel14 = new ThoughtsModel();
            thoughtsModel14.type = THOUGHTS_RELATIONSHIP;
            thoughtsModel14.distortion = THOUGHTS_MIND_READING;
            thoughtsModel14.GoalId = THOUGHT_GOAL_ID_MIND_READING;
            thoughtsModel14.text1 = "Your partner and you had an argument, after which you haven't called each other.";
            thoughtsModel14.text2 = "Say this leads to negative thinking pattern - Mind Reading";
            thoughtsModel14.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My partner is planning to leave me.</strong></font>";
            thoughtsModel14.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">anxious and sad.</strong></font>";
            thoughtsModel14.text5 = "Your partner has not initiated conversation since then.";
            thoughtsModel14.text6 = "Your partner and you have had quite a few arguments recently.";
            thoughtsModel14.text7 = "Your previous relationship ended because you were fighting a lot.";
            thoughtsModel14.text8 = "Your partner and you have had arguments before but have always made up.";
            thoughtsModel14.text9 = "Your partner usually takes longer to calm down than you do.";
            thoughtsModel14.text10 = "Your partner is busy with an important meeting at work today.";
            thoughtsModel14.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">My partner might be upset, but that does not mean they want to leave me.</strong></font>";
            thoughtsModel14.text12 = "You may now start feeling \n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel14.text13 = "Your partner may need some time and space to cool down.";
            thoughtsModel14.text14 = "Your partner not calling you doesn't mean they want to leave you.";
            thoughtsModel14.text15 = "Your partner may be busy with work or other commitments.";
            thoughtsModel14.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner might be upset, but that does not mean they want to leave me.</strong></font>";
            thoughtsModel14.text17 = "You may now start feeling \n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel2 = thoughtsModel14;
        }
        if (str.equals(THOUGHTS_RELATIONSHIP) && str2.equals(THOUGHTS_FORTUNE_TELLING)) {
            ThoughtsModel thoughtsModel15 = new ThoughtsModel();
            thoughtsModel15.type = THOUGHTS_RELATIONSHIP;
            thoughtsModel15.distortion = THOUGHTS_FORTUNE_TELLING;
            thoughtsModel15.GoalId = THOUGHT_GOAL_ID_FORTUNE_TELLING;
            thoughtsModel15.text1 = "Your friend has set up a date for you tonight.";
            thoughtsModel15.text2 = "Say this leads to negative thinking pattern - Fortune Telling";
            thoughtsModel15.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I am going to make a fool of myself.</strong></font>";
            thoughtsModel15.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">worried and anxious.</strong></font>";
            thoughtsModel15.text5 = "Your previous dates didn't lead to long-term relationships.";
            if (str11 != null) {
                str12 = str11;
                if (!str12.equals(COURSE_DEPRESSION) && !str12.equals(COURSE_WORRY)) {
                    obj2 = obj;
                    if (!str12.equals(obj2)) {
                        thoughtsModel15.text6 = "The last time you spilled your drink on your date.";
                    }
                } else {
                    obj2 = obj;
                }
                thoughtsModel15.text6 = "The last time you went on a date, you spilled your drink on the other person.";
            } else {
                obj2 = obj;
                str12 = str11;
            }
            thoughtsModel15.text7 = "You have always felt awkard meeting someone for the first time.";
            thoughtsModel15.text8 = "You have been told that you are fun to be with.";
            thoughtsModel15.text9 = "Though your last date didn't lead to something serious, you two are friends now.";
            thoughtsModel15.text10 = "You are in a better frame of mind this time than you were during your last date.";
            thoughtsModel15.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Instead of worrying about my date, I can be myself and enjoy it.</strong></font>";
            thoughtsModel15.text12 = "You may now start feeling\n<strong><font color=\"#47A8AD\">hopeful.</strong></font>";
            thoughtsModel15.text13 = "You cannot predict the outcome of a date beforehand.";
            thoughtsModel15.text14 = "Making a mistake does not mean that you have made a fool of yourself.";
            thoughtsModel15.text15 = "You cannot assume that the past will repeat itself in this situation too.";
            thoughtsModel15.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Instead of worrying about my date, I can be myself and enjoy it.</strong></font>";
            thoughtsModel15.text17 = "You may now start feeling\n<strong><font color=\"#47A8AD\">hopeful.</strong></font>";
            thoughtsModel2 = thoughtsModel15;
        } else {
            obj2 = obj;
            str12 = str11;
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
            String str18 = str4;
            if (str2.equals(str18)) {
                ThoughtsModel thoughtsModel16 = new ThoughtsModel();
                thoughtsModel16.type = THOUGHTS_RELATIONSHIP;
                thoughtsModel16.distortion = str18;
                thoughtsModel16.GoalId = THOUGHT_GOAL_ID_BLACK_AND_WHITE_THINKIING;
                thoughtsModel16.text1 = "You took your partner to their favourite restaurant, but they didn't seem too happy.";
                thoughtsModel16.text2 = "Say this leads to negative thinking pattern - Black and White Thinking";
                thoughtsModel16.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My partner is quiet - I couldn't make them happy. I am hopeless.</strong></font>";
                if (str12 != null && str12.equals(obj2)) {
                    str16 = "sad and worried.";
                } else {
                    str16 = "depressed and anxious.";
                }
                str13 = str9;
                thoughtsModel16.text4 = defpackage.b.m("You may feel\n<br><strong><font color=\"#47A8AD\">", str16, str13);
                thoughtsModel16.text5 = "Your partner did not speak much during your meal.";
                thoughtsModel16.text6 = "When your partner is upset with you, they tend to be quiet.";
                thoughtsModel16.text7 = "Your partner has made you feel happy on several occasions.";
                thoughtsModel16.text8 = "Your partner is not too verbally expressive as a person.";
                thoughtsModel16.text9 = "At times, you too have not verbally expressed your happiness.";
                thoughtsModel16.text10 = "Your partner has often said that you are wonderful and you make them happy.";
                thoughtsModel16.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">My partner could be quiet for various reasons; it does not mean I am hopeless.</strong></font>";
                thoughtsModel16.text12 = "You might start feeling\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
                thoughtsModel16.text13 = "Your partner being quiet does not mean that they are unhappy.";
                thoughtsModel16.text14 = "Not making your partner happy in one instance does not make you hopeless.";
                thoughtsModel16.text15 = "Your partner might be preoccupied with something unrelated to you, like work.";
                thoughtsModel16.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner could be quiet for various reasons; it does not mean I am hopeless.</strong></font>";
                thoughtsModel16.text17 = "You might start feeling\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
                thoughtsModel2 = thoughtsModel16;
                if (str.equals(THOUGHTS_RELATIONSHIP) && str2.equals(THOUGHTS_EMOTIONAL_REASONING)) {
                    ThoughtsModel thoughtsModel17 = new ThoughtsModel();
                    thoughtsModel17.type = THOUGHTS_RELATIONSHIP;
                    thoughtsModel17.distortion = THOUGHTS_EMOTIONAL_REASONING;
                    thoughtsModel17.GoalId = THOUGHT_GOAL_ID_EMOTIONAL_REASONING;
                    thoughtsModel17.text1 = "While watching a movie, your partner commented on how attractive the actor was.";
                    thoughtsModel17.text2 = "Say this leads to negative thinking pattern - Emotional Reasoning";
                    thoughtsModel17.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I feel unworthy. Obviously, my partner doesn’t find me attractive.</strong></font>";
                    thoughtsModel17.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\"> Insecure and depressed.</strong></font>";
                    thoughtsModel17.text5 = "Your partner has often said that they find certain actors attractive.";
                    thoughtsModel17.text6 = "You have recently gained some weight and are not feeling good about it.";
                    thoughtsModel17.text7 = "Some of your friends have been teasing you about your weight.";
                    thoughtsModel17.text8 = "Your partner has told you several times that they find you attractive.";
                    thoughtsModel17.text9 = "In the past, you too have commented on how you find some actors attractive.";
                    thoughtsModel17.text10 = "You've been trying to manage your weight and your partner has supported you.";
                    thoughtsModel17.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Just because I am feeling unworthy, I am assuming that my partner thinks the same about me.</strong></font>";
                    thoughtsModel17.text12 = "You may now feel \n<strong><font color=\"#47A8AD\">calmer and more balanced.</strong></font>";
                    thoughtsModel17.text13 = "Your partner was just expressing an opinion, as you both do with each other.";
                    thoughtsModel17.text14 = "Your partner finding others attractive doesn't mean they find you less attractive.";
                    thoughtsModel17.text15 = "When you feel negatively about yourself, you may think that others do so too.";
                    thoughtsModel17.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Just because I am feeling unworthy, I am assuming that my partner thinks the same about me.</strong></font>";
                    thoughtsModel17.text17 = "You may now feel \n<strong><font color=\"#47A8AD\">calmer and more balanced.</strong></font>";
                    thoughtsModel2 = thoughtsModel17;
                }
                if (str.equals(THOUGHTS_RELATIONSHIP)) {
                    String str19 = str3;
                    if (str2.equals(str19)) {
                        ThoughtsModel thoughtsModel18 = new ThoughtsModel();
                        thoughtsModel18.type = THOUGHTS_RELATIONSHIP;
                        thoughtsModel18.distortion = str19;
                        thoughtsModel18.GoalId = THOUGHT_GOAL_ID_CATASTROPHISATION;
                        thoughtsModel18.text1 = "You've been trying to call your partner for an hour, and they haven't answered.";
                        thoughtsModel18.text2 = "Say this leads to negative thinking pattern - Catastrophisation";
                        thoughtsModel18.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">Something terrible has happened to my partner.</strong></font>";
                        thoughtsModel18.text4 = "You may start feeling extremely\n<br><strong><font color=\"#47A8AD\"> anxious and panicked.</strong></font>";
                        thoughtsModel18.text5 = "Your partner usually answers your calls right away.";
                        thoughtsModel18.text6 = "Even if your partner misses your call, they call you back very soon.";
                        thoughtsModel18.text7 = "Your partner was slightly unwell this morning.";
                        thoughtsModel18.text8 = "You called at a time when your partner would not be expecting it.";
                        thoughtsModel18.text9 = "Your partner's phone is often on silent mode.";
                        thoughtsModel18.text10 = "You spoke to your partner a few hours ago and they were fine.";
                        thoughtsModel18.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Your partner not answering calls doesn't mean that something bad has happened.</strong></font>";
                        thoughtsModel18.text12 = "You may now start feeling \n<strong><font color=\"#47A8AD\">calm.</strong></font>";
                        thoughtsModel18.text13 = "Your partner might be busy with work and may have not checked their phone.";
                        thoughtsModel18.text14 = "Maybe their phone is on silent, which is why they missed your calls.";
                        thoughtsModel18.text15 = "It's only been an hour that they haven't answered; maybe you could wait a while.";
                        thoughtsModel18.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner not answering calls doesn't mean that something bad has happened./strong></font>";
                        thoughtsModel18.text17 = "You may now start feeling \n<strong><font color=\"#47A8AD\">calm.</strong></font>";
                        thoughtsModel2 = thoughtsModel18;
                    }
                }
                if (str.equals(THOUGHTS_RELATIONSHIP)) {
                    String str20 = str5;
                    if (str2.equals(str20)) {
                        ThoughtsModel thoughtsModel19 = new ThoughtsModel();
                        thoughtsModel19.type = THOUGHTS_RELATIONSHIP;
                        thoughtsModel19.distortion = str20;
                        thoughtsModel19.GoalId = THOUGHT_GOAL_ID_SHOULD_AND_MUST;
                        thoughtsModel19.text1 = "Your partner had an argument with their friend, and they are unusually quiet.";
                        thoughtsModel19.text2 = "Say this leads to negative thinking pattern - Should's & Must's";
                        thoughtsModel19.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I must always be able to cheer my partner up.</strong></font>";
                        thoughtsModel19.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">anxious and disappointed.</strong></font>";
                        thoughtsModel19.text5 = "Your partner always tries to make you happy.";
                        thoughtsModel19.text6 = "You have been able to make your partner feel better at times.";
                        thoughtsModel19.text7 = "Your friends say you are cheerful and funny.";
                        thoughtsModel19.text8 = "Sometimes, your partner is unable to make you feel better despite trying.";
                        thoughtsModel19.text9 = "Your partner likes to be by themselves when they are upset.";
                        thoughtsModel19.text10 = "Your partner gives you time and space when you need it.";
                        thoughtsModel19.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">I will support my partner without expecting to ensure that I make things better.</strong></font>";
                        thoughtsModel19.text12 = "You may now feel\n<strong><font color=\"#47A8AD\">contented.</strong></font>";
                        thoughtsModel19.text13 = "Everyone takes time to work through their emotions.";
                        thoughtsModel19.text14 = "You cannot always ensure that everybody around you is happy.";
                        thoughtsModel19.text15 = "You have offered support and let your partner know that you are there for them.";
                        thoughtsModel19.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I will support my partner without expecting to ensure that I make things better.</strong></font>";
                        thoughtsModel19.text17 = "You may now feel\n<strong><font color=\"#47A8AD\">contented.</strong></font>";
                        thoughtsModel2 = thoughtsModel19;
                    }
                }
                if (str.equals(THOUGHTS_RELATIONSHIP)) {
                    String str21 = str6;
                    if (str2.equals(str21)) {
                        ThoughtsModel thoughtsModel20 = new ThoughtsModel();
                        thoughtsModel20.type = THOUGHTS_RELATIONSHIP;
                        thoughtsModel20.distortion = str21;
                        thoughtsModel20.GoalId = str21;
                        thoughtsModel20.text1 = "Your partner forgot you were going out, even though you had told them.";
                        thoughtsModel20.text2 = "Say this leads to negative thinking pattern - Overgeneralisation";
                        thoughtsModel20.text3 = "You might think<br><strong><font color=\"#47A8AD\">My partner never remembers anything I say.</strong></font>";
                        if (str12 != null && str12.equals(COURSE_ANGER)) {
                            str14 = "angry and irritated.";
                        } else {
                            str14 = "sad.";
                        }
                        thoughtsModel20.text4 = defpackage.b.m("You may feel<br><strong><font color=\"#47A8AD\"> ", str14, str13);
                        thoughtsModel20.text5 = "Your partner had forgotten about your plans the last time as well.";
                        thoughtsModel20.text6 = "You usually have to send your partner a reminder about your plans.";
                        thoughtsModel20.text7 = "You had told your partner multiple times about your plans for tonight.";
                        thoughtsModel20.text8 = "Your partner has often remembered what you have told them.";
                        thoughtsModel20.text9 = "Your partner was busy with something when you had told them about your plans.";
                        thoughtsModel20.text10 = "Though they may not always remember things, your partner does listen to you intently.";
                        thoughtsModel20.text11 = "You might now think<br><strong><font color=\"#33b5e5\">My partner does forget things sometimes, but also remembers them several times.</strong></font>";
                        if (str12.equals(COURSE_ANGER)) {
                            str15 = "calm.";
                        } else {
                            str15 = "contented.";
                        }
                        String m10 = defpackage.b.m("You may start feeling <strong><font color=\"#47A8AD\">", str15, str13);
                        thoughtsModel20.text12 = m10;
                        thoughtsModel20.text13 = "Your partner may have forgotten as they have been preoccupied with work of late.";
                        thoughtsModel20.text14 = "Just because your partner forgot this one time, doesn't mean they never listen to you.";
                        thoughtsModel20.text15 = "It is okay for your partner to sometimes forget things that are not too urgent.";
                        thoughtsModel20.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner does forget things sometimes, but also remembers them several times.</strong></font>";
                        thoughtsModel20.text17 = m10;
                        thoughtsModel2 = thoughtsModel20;
                    }
                }
                if (str.equals(THOUGHTS_RELATIONSHIP)) {
                    String str22 = str7;
                    if (str2.equals(str22)) {
                        ThoughtsModel thoughtsModel21 = new ThoughtsModel();
                        thoughtsModel21.type = THOUGHTS_RELATIONSHIP;
                        thoughtsModel21.distortion = str22;
                        thoughtsModel21.GoalId = str22;
                        thoughtsModel21.text1 = "Your partner stayed up all night to talk to you, because you were upset.";
                        thoughtsModel21.text2 = "Say this leads to negative thinking pattern - Discounting the Positive";
                        thoughtsModel21.text3 = "You might think<br><strong><font color=\"#47A8AD\">My partner did stay up to talk to me, but they would have done that for anyone.</strong></font>";
                        thoughtsModel21.text4 = "You may feel<br><strong><font color=\"#47A8AD\"> sad.</strong></font>";
                        thoughtsModel21.text5 = "Your partner is a helpful person and helps everyone.";
                        thoughtsModel21.text6 = "Your partner has stayed up before when their friends needed them.";
                        thoughtsModel21.text7 = "You asked your partner to stay up with you.";
                        thoughtsModel21.text8 = "Your partner has prioritised you over their friends before.";
                        thoughtsModel21.text9 = "Your partner has never done anything special for someone they do not care about.";
                        thoughtsModel21.text10 = "Your partner has always told you that you mean a lot to them.";
                        thoughtsModel21.text11 = "You might now think<br><strong><font color=\"#33b5e5\">My partner would not have stayed up with me if they did not value me.</strong></font>";
                        thoughtsModel21.text12 = "You may now start feeling <strong><font color=\"#47A8AD\">happy and contented.</strong></font>";
                        thoughtsModel21.text13 = "Your partner may have stayed up because they wanted to be there for you.";
                        thoughtsModel21.text14 = "You support your friends, but that doesn't make your partner less special.";
                        thoughtsModel21.text15 = "Your partner is helpful, but that does not negate the effort they make for you.";
                        thoughtsModel21.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner would not have stayed up with me if they did not value me.</strong></font>";
                        thoughtsModel21.text17 = "You may now start feeling <strong><font color=\"#47A8AD\">happy and contented.</strong></font>";
                        thoughtsModel2 = thoughtsModel21;
                    }
                }
                if (str.equals(THOUGHTS_RELATIONSHIP)) {
                    String str23 = str8;
                    if (str2.equals(str23)) {
                        ThoughtsModel thoughtsModel22 = new ThoughtsModel();
                        thoughtsModel22.type = THOUGHTS_RELATIONSHIP;
                        thoughtsModel22.distortion = str23;
                        thoughtsModel22.GoalId = str23;
                        thoughtsModel22.text1 = "Your partner has been stressed because of their work for the past few months.";
                        thoughtsModel22.text2 = "Say this leads to negative thinking pattern - Personalisation";
                        thoughtsModel22.text3 = "You might think<br><strong><font color=\"#47A8AD\">If I was more supportive, my partner would not be so stressed all the time.</strong></font>";
                        thoughtsModel22.text4 = "You may feel<br><strong><font color=\"#47A8AD\"> sad and guilty.</strong></font>";
                        thoughtsModel22.text5 = "You and your partner have been fighting frequently about their work.";
                        thoughtsModel22.text6 = "Despite trying, you have not been able to reduce their stress.";
                        thoughtsModel22.text7 = "You have been caught up with your own work commitments.";
                        thoughtsModel22.text8 = "Your partner is stressed owing to factors that are not in your control.";
                        thoughtsModel22.text9 = "At times, your partner has mentioned that they feel supported by you.";
                        thoughtsModel22.text10 = "You have taken up more responsibilities at home so their workload reduces.";
                        thoughtsModel22.text11 = "You might now think<br><strong><font color=\"#33b5e5\">I can be more patient, but I cannot prevent my partner from experiencing stress.</strong></font>";
                        thoughtsModel22.text12 = "You may start feeling more <strong><font color=\"#47A8AD\">positive.</strong></font>";
                        thoughtsModel22.text13 = "There could be many other reasons why your partner has been more stressed.";
                        thoughtsModel22.text14 = "Talking to your partner about your feelings might help them feel closer to you.";
                        thoughtsModel22.text15 = "Your partner may actually need some space to figure things out themselves.";
                        thoughtsModel22.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I can be more patient, but I cannot prevent my partner from experiencing stress.</strong></font>";
                        thoughtsModel22.text17 = "You may start feeling more <strong><font color=\"#47A8AD\">positive.</strong></font>";
                        thoughtsModel2 = thoughtsModel22;
                    }
                }
                if (str.equals(THOUGHTS_RELATIONSHIP) && str2.equals("blaming")) {
                    ThoughtsModel thoughtsModel23 = new ThoughtsModel();
                    thoughtsModel23.type = THOUGHTS_RELATIONSHIP;
                    thoughtsModel23.distortion = "blaming";
                    thoughtsModel23.GoalId = "blaming";
                    thoughtsModel23.text1 = "Your partner calls to cancel your dinner date, as they have to work late.";
                    thoughtsModel23.text2 = "Say this leads to negative thinking pattern - Blaming";
                    thoughtsModel23.text3 = "You might think<br><strong><font color=\"#47A8AD\">My partner doesn't care about my feelings at all.</strong></font>";
                    thoughtsModel23.text4 = "You may feel<br><strong><font color=\"#47A8AD\"> Angry.</strong></font>";
                    thoughtsModel23.text5 = "Your partner knew that you were looking forward to dinner.";
                    thoughtsModel23.text6 = "Your partner had promised that they would be there.";
                    thoughtsModel23.text7 = "Your partner didn't call you again after you said you were upset.";
                    thoughtsModel23.text8 = "Your partner has expressed their care for you on several ocassions.";
                    thoughtsModel23.text9 = "Your partner apologised sincerely and promised to make it up to you.";
                    thoughtsModel23.text10 = "Your partner had to go into a meeting immediately after you spoke.";
                    thoughtsModel23.text11 = "You might now think<br><strong><font color=\"#33b5e5\">My partner cares about my feelings, and did not do this to hurt me.</strong></font>";
                    thoughtsModel23.text12 = "You might now feel <strong><font color=\"#47A8AD\">calm.</strong></font>";
                    thoughtsModel23.text13 = "Cancelling one date does not mean your partner doesn't care about you.";
                    thoughtsModel23.text14 = "Your partner might have not expected this meeting to come up.";
                    thoughtsModel23.text15 = "Your partner may be feeling as bad about this as you do.";
                    thoughtsModel23.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner cares about my feelings, and did not do this to hurt me.</strong></font>";
                    thoughtsModel23.text17 = "You might now feel <strong><font color=\"#47A8AD\">calm.</strong></font>";
                    thoughtsModel2 = thoughtsModel23;
                }
                if (str.equals(THOUGHTS_RELATIONSHIP)) {
                    String str24 = str10;
                    if (str2.equals(str24)) {
                        ThoughtsModel thoughtsModel24 = new ThoughtsModel();
                        thoughtsModel24.type = THOUGHTS_RELATIONSHIP;
                        thoughtsModel24.distortion = str24;
                        thoughtsModel24.GoalId = THOUGHT_GOAL_ID_MIND_READING;
                        thoughtsModel24.text1 = "Your partner called you twice while you were working late to ask where you were.";
                        thoughtsModel24.text2 = "Say this leads to negative thinking pattern - Mind Reading";
                        thoughtsModel24.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My partner doesn't trust me.</strong></font>";
                        thoughtsModel24.text4 = "You might feel\n<br><strong><font color=\"#47A8AD\">angry.</strong></font>";
                        thoughtsModel24.text5 = "Your partner asked you whether you were working alone or with someone.";
                        thoughtsModel24.text6 = "Your partner called a second time to check when you would be leaving.";
                        thoughtsModel24.text7 = "Of late, your partner has been upset about you coming home late.";
                        thoughtsModel24.text8 = "Your partner tends to worry about you easily.";
                        thoughtsModel24.text9 = "Your partner has always been supportive of and understanding towards your work.";
                        thoughtsModel24.text10 = "Your partner did not question you further or ask for any proof.";
                        thoughtsModel24.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">My partner called me out of concern for me - not because they don't trust me.</strong></font>";
                        thoughtsModel24.text12 = "You might now feel\n<strong><font color=\"#47A8AD\">contended.</strong></font>";
                        thoughtsModel24.text13 = "Maybe your partner called you because they wanted to have dinner with you.";
                        thoughtsModel24.text14 = "Your partner could have been worried about your safety, as it was quite late.";
                        thoughtsModel24.text15 = "You may have checked on your partner too, had they been working late.";
                        thoughtsModel24.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner called me out of concern, not because they do not trust me.</strong></font>";
                        thoughtsModel24.text17 = "You might now feel\n<strong><font color=\"#47A8AD\">contended.</strong></font>";
                        thoughtsModel2 = thoughtsModel24;
                    }
                }
                if (str.equals(THOUGHTS_RELATIONSHIP) && str2.equals(THOUGHTS_ANGER_MIND_READING)) {
                    ThoughtsModel thoughtsModel25 = new ThoughtsModel();
                    thoughtsModel25.type = THOUGHTS_RELATIONSHIP;
                    thoughtsModel25.distortion = THOUGHTS_ANGER_MIND_READING;
                    thoughtsModel25.GoalId = THOUGHT_GOAL_ID_MIND_READING;
                    thoughtsModel25.text1 = "Your partner called you twice while you were working late to ask where you were.";
                    thoughtsModel25.text2 = "Say this leads to negative thinking pattern - Mind Reading";
                    thoughtsModel25.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My partner doesn't trust me.</strong></font>";
                    thoughtsModel25.text4 = "You might feel\n<br><strong><font color=\"#47A8AD\">angry.</strong></font>";
                    thoughtsModel25.text5 = "Your partner asked you whether you were working alone or with someone.";
                    thoughtsModel25.text6 = "Your partner called a second time to check when you would be leaving.";
                    thoughtsModel25.text7 = "Of late, your partner has been upset about you coming home late.";
                    thoughtsModel25.text8 = "Your partner tends to worry about you easily.";
                    thoughtsModel25.text9 = "Your partner has always been supportive of and understanding towards your work.";
                    thoughtsModel25.text10 = "Your partner did not question you further or ask for any proof.";
                    thoughtsModel25.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">My partner called me out of concern for me - not because they don't trust me.</strong></font>";
                    thoughtsModel25.text12 = "You might now feel\n<strong><font color=\"#47A8AD\">contented.</strong></font>";
                    thoughtsModel25.text13 = "Maybe your partner called you because they wanted to have dinner with you.";
                    thoughtsModel25.text14 = "Your partner could have been worried about your safety, as it was quite late.";
                    thoughtsModel25.text15 = "You may have checked on your partner too, had they been working late.";
                    thoughtsModel25.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner called me out of concern for me - not because they don't trust me.</strong></font>";
                    thoughtsModel25.text17 = "You might now feel\n<strong><font color=\"#47A8AD\">contented.</strong></font>";
                    thoughtsModel2 = thoughtsModel25;
                }
                if (str.equals(THOUGHTS_RELATIONSHIP) && str2.equals(THOUGHTS_ANGER_LABELLING)) {
                    ThoughtsModel thoughtsModel26 = new ThoughtsModel();
                    thoughtsModel26.type = THOUGHTS_RELATIONSHIP;
                    thoughtsModel26.distortion = THOUGHTS_ANGER_LABELLING;
                    thoughtsModel26.GoalId = THOUGHT_GOAL_ID_LABELLING;
                    thoughtsModel26.text1 = "You recently broke up with your partner.";
                    thoughtsModel26.text2 = "Say this leads to negative thinking pattern - Labelling";
                    thoughtsModel26.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I am a failure.</strong></font>";
                    thoughtsModel26.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">angry and depressed.</strong></font>";
                    thoughtsModel26.text5 = "Your previous relationship did not work out either.";
                    thoughtsModel26.text6 = "You tried very hard to make this relationship work.";
                    thoughtsModel26.text7 = "Your best friend has been in a relationship for years and is gettting married.";
                    thoughtsModel26.text8 = "You have been doing very well in various aspects of your life.";
                    thoughtsModel26.text9 = "Your partner and you mutually decided to break up, as it was for the best.";
                    thoughtsModel26.text10 = "Your partner often said that you were good to them in the relationship.";
                    thoughtsModel26.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Breaking up has been upsetting and disappointing, but it does not make me a failure.</strong></font>";
                    thoughtsModel26.text12 = "You might now feel \n<strong><font color=\"#47A8AD\">hopeful and calm.</strong></font>";
                    thoughtsModel26.text13 = "Not having a romantic relationship does not make you a failure.";
                    thoughtsModel26.text14 = "You may have been more unhappy had you stayed in the relationship.";
                    thoughtsModel26.text15 = "You may have broken up, but may still do well in other areas of your life.";
                    thoughtsModel26.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Breaking up has been upsetting and disappointing, but it does not make me a failure.</strong></font>";
                    thoughtsModel26.text17 = "You might now feel \n<strong><font color=\"#47A8AD\">hopeful and calm.</strong></font>";
                    thoughtsModel2 = thoughtsModel26;
                }
                if (str.equals(THOUGHTS_RELATIONSHIP) && str2.equals(THOUGHTS_ANGER_BLAMING)) {
                    ThoughtsModel thoughtsModel27 = new ThoughtsModel();
                    thoughtsModel27.type = THOUGHTS_RELATIONSHIP;
                    thoughtsModel27.distortion = THOUGHTS_ANGER_BLAMING;
                    thoughtsModel27.GoalId = "blaming";
                    thoughtsModel27.text1 = "Your partner called to cancel your dinner as they had to work late.";
                    thoughtsModel27.text2 = "Say this leads to negative thinking pattern - Blaming";
                    thoughtsModel27.text3 = "You might think<br><strong><font color=\"#47A8AD\">My partner doesn't care about my feelings at all.</strong></font>";
                    thoughtsModel27.text4 = "You may feel<br><strong><font color=\"#47A8AD\"> Angry</strong></font>";
                    thoughtsModel27.text5 = "Your partner knew that you were looking forward to dinner.";
                    thoughtsModel27.text6 = "Your partner had promised that they would be there.";
                    thoughtsModel27.text7 = "Your partner didn't call you again after you said you were upset.";
                    thoughtsModel27.text8 = "Your partner did not expect this meeting to abruptly come up.";
                    thoughtsModel27.text9 = "Your partner apologised sincerely and promised to make it up to you.";
                    thoughtsModel27.text10 = "Your partner had to go into the meeting immediately after you spoke.";
                    thoughtsModel27.text11 = "You might now think<br><strong><font color=\"#33b5e5\">My partner cares about my feelings, and did not do this to hurt me.</strong></font>";
                    thoughtsModel27.text12 = "You may feel <strong><font color=\"#47A8AD\">calm.</strong></font>";
                    thoughtsModel27.text13 = "Just because your partner couldn't make it doesn't mean they don't care for you.";
                    thoughtsModel27.text14 = "Your partner may have felt equally bad about missing the dinner.";
                    thoughtsModel27.text15 = "Your partner might have tried to postpone the meeting but couldn't have.";
                    thoughtsModel27.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner cares about my feelings, and did not do this to hurt me.</strong></font>";
                    thoughtsModel27.text17 = "You may feel <strong><font color=\"#47A8AD\">calm.</strong></font>";
                    thoughtsModel2 = thoughtsModel27;
                }
                if (str.equals(THOUGHTS_RELATIONSHIP) && str2.equals(THOUGHTS_ANGER_CATASTROPHISATION)) {
                    ThoughtsModel thoughtsModel28 = new ThoughtsModel();
                    thoughtsModel28.type = THOUGHTS_RELATIONSHIP;
                    thoughtsModel28.distortion = THOUGHTS_ANGER_CATASTROPHISATION;
                    thoughtsModel28.GoalId = THOUGHT_GOAL_ID_CATASTROPHISATION;
                    thoughtsModel28.text1 = "Your partner and you had a big argument.";
                    thoughtsModel28.text2 = "Say this leads to negative thinking pattern - Catastrophisation";
                    thoughtsModel28.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My partner has completely ruined my life.</strong></font>";
                    thoughtsModel28.text4 = "You might feel\n<br><strong><font color=\"#47A8AD\">angry.</strong></font>";
                    thoughtsModel28.text5 = "Of late, your partner and you have been fighting frequently. ";
                    thoughtsModel28.text6 = "You have been feeling more stressed at work due to the fights with your partner.";
                    thoughtsModel28.text7 = "Your partner has not called to apologise or make amends.";
                    thoughtsModel28.text8 = "Your partner and you have eventually always made up after a fight.";
                    thoughtsModel28.text9 = "Despite the fights, your partner does a lot for you.";
                    thoughtsModel28.text10 = "You still rely on your partner for emotional support.";
                    thoughtsModel28.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">I am stressed out presenty, but my partner has not messed up my life completely.</strong></font>";
                    thoughtsModel28.text12 = "You may now start feeling\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
                    thoughtsModel28.text13 = "There could be reasons other than this fight that have stressed you out of late.";
                    thoughtsModel28.text14 = "Just because your partner and you fight doesn't mean they have ruined your life.";
                    thoughtsModel28.text15 = "It's okay for two to fight sometimes, as long as you two resolve the conflict.";
                    thoughtsModel28.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I am stressed out presently, but my partner has not messed up my life completely.</strong></font>";
                    thoughtsModel28.text17 = "You may now start feeling\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
                    thoughtsModel2 = thoughtsModel28;
                }
                if (!str.equals(THOUGHTS_RELATIONSHIP) && str2.equals(THOUGHTS_ANGER_SHOULD_AND_MUST)) {
                    ThoughtsModel thoughtsModel29 = new ThoughtsModel();
                    thoughtsModel29.type = THOUGHTS_RELATIONSHIP;
                    thoughtsModel29.distortion = THOUGHTS_ANGER_SHOULD_AND_MUST;
                    thoughtsModel29.GoalId = THOUGHT_GOAL_ID_SHOULD_AND_MUST;
                    thoughtsModel29.text1 = "Your partner said they were tired when you suggested that you two go watch a movie.";
                    thoughtsModel29.text2 = "Say this leads to negative thinking pattern - Should's & Must's";
                    thoughtsModel29.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My partner should want to do the same things that I want to.</strong></font>";
                    thoughtsModel29.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">Angry and resentful.</strong></font>";
                    thoughtsModel29.text5 = "You usually agree to your partner's suggestions.";
                    thoughtsModel29.text6 = "Your partner did not agree with your last suggestion as well.";
                    thoughtsModel29.text7 = "Your friend and their partner are always doing things together.";
                    thoughtsModel29.text8 = "Your partner has agreed with your suggestions very often.";
                    thoughtsModel29.text9 = "When you feel tired, your partner is understanding and doesn't push you.";
                    thoughtsModel29.text10 = "Your partner apologised, and suggested watching the movie the next day.";
                    thoughtsModel29.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">It is okay for my partner and I to want different things sometimes.</strong></font>";
                    thoughtsModel29.text12 = "You may start feeling \n<strong><font color=\"#47A8AD\"> happy.</strong></font>";
                    thoughtsModel29.text13 = "You partner and you may not agree on everything, and that is okay.";
                    thoughtsModel29.text14 = "Your partner could be genuinely tired and may not have the energy to go out.";
                    thoughtsModel29.text15 = "You may enjoy the outing more when both of you are up for it.";
                    thoughtsModel29.text16 = "You might now think\n<strong><font color=\"#33b5e5\">It is okay for my partner and I to want different things sometimes.</strong></font>";
                    thoughtsModel29.text17 = "You may start feeling \n<strong><font color=\"#47A8AD\"> happy.</strong></font>";
                    return thoughtsModel29;
                }
            }
        }
        str13 = str9;
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
            ThoughtsModel thoughtsModel172 = new ThoughtsModel();
            thoughtsModel172.type = THOUGHTS_RELATIONSHIP;
            thoughtsModel172.distortion = THOUGHTS_EMOTIONAL_REASONING;
            thoughtsModel172.GoalId = THOUGHT_GOAL_ID_EMOTIONAL_REASONING;
            thoughtsModel172.text1 = "While watching a movie, your partner commented on how attractive the actor was.";
            thoughtsModel172.text2 = "Say this leads to negative thinking pattern - Emotional Reasoning";
            thoughtsModel172.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I feel unworthy. Obviously, my partner doesn’t find me attractive.</strong></font>";
            thoughtsModel172.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\"> Insecure and depressed.</strong></font>";
            thoughtsModel172.text5 = "Your partner has often said that they find certain actors attractive.";
            thoughtsModel172.text6 = "You have recently gained some weight and are not feeling good about it.";
            thoughtsModel172.text7 = "Some of your friends have been teasing you about your weight.";
            thoughtsModel172.text8 = "Your partner has told you several times that they find you attractive.";
            thoughtsModel172.text9 = "In the past, you too have commented on how you find some actors attractive.";
            thoughtsModel172.text10 = "You've been trying to manage your weight and your partner has supported you.";
            thoughtsModel172.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Just because I am feeling unworthy, I am assuming that my partner thinks the same about me.</strong></font>";
            thoughtsModel172.text12 = "You may now feel \n<strong><font color=\"#47A8AD\">calmer and more balanced.</strong></font>";
            thoughtsModel172.text13 = "Your partner was just expressing an opinion, as you both do with each other.";
            thoughtsModel172.text14 = "Your partner finding others attractive doesn't mean they find you less attractive.";
            thoughtsModel172.text15 = "When you feel negatively about yourself, you may think that others do so too.";
            thoughtsModel172.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Just because I am feeling unworthy, I am assuming that my partner thinks the same about me.</strong></font>";
            thoughtsModel172.text17 = "You may now feel \n<strong><font color=\"#47A8AD\">calmer and more balanced.</strong></font>";
            thoughtsModel2 = thoughtsModel172;
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
            ThoughtsModel thoughtsModel232 = new ThoughtsModel();
            thoughtsModel232.type = THOUGHTS_RELATIONSHIP;
            thoughtsModel232.distortion = "blaming";
            thoughtsModel232.GoalId = "blaming";
            thoughtsModel232.text1 = "Your partner calls to cancel your dinner date, as they have to work late.";
            thoughtsModel232.text2 = "Say this leads to negative thinking pattern - Blaming";
            thoughtsModel232.text3 = "You might think<br><strong><font color=\"#47A8AD\">My partner doesn't care about my feelings at all.</strong></font>";
            thoughtsModel232.text4 = "You may feel<br><strong><font color=\"#47A8AD\"> Angry.</strong></font>";
            thoughtsModel232.text5 = "Your partner knew that you were looking forward to dinner.";
            thoughtsModel232.text6 = "Your partner had promised that they would be there.";
            thoughtsModel232.text7 = "Your partner didn't call you again after you said you were upset.";
            thoughtsModel232.text8 = "Your partner has expressed their care for you on several ocassions.";
            thoughtsModel232.text9 = "Your partner apologised sincerely and promised to make it up to you.";
            thoughtsModel232.text10 = "Your partner had to go into a meeting immediately after you spoke.";
            thoughtsModel232.text11 = "You might now think<br><strong><font color=\"#33b5e5\">My partner cares about my feelings, and did not do this to hurt me.</strong></font>";
            thoughtsModel232.text12 = "You might now feel <strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel232.text13 = "Cancelling one date does not mean your partner doesn't care about you.";
            thoughtsModel232.text14 = "Your partner might have not expected this meeting to come up.";
            thoughtsModel232.text15 = "Your partner may be feeling as bad about this as you do.";
            thoughtsModel232.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner cares about my feelings, and did not do this to hurt me.</strong></font>";
            thoughtsModel232.text17 = "You might now feel <strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel2 = thoughtsModel232;
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
            ThoughtsModel thoughtsModel252 = new ThoughtsModel();
            thoughtsModel252.type = THOUGHTS_RELATIONSHIP;
            thoughtsModel252.distortion = THOUGHTS_ANGER_MIND_READING;
            thoughtsModel252.GoalId = THOUGHT_GOAL_ID_MIND_READING;
            thoughtsModel252.text1 = "Your partner called you twice while you were working late to ask where you were.";
            thoughtsModel252.text2 = "Say this leads to negative thinking pattern - Mind Reading";
            thoughtsModel252.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My partner doesn't trust me.</strong></font>";
            thoughtsModel252.text4 = "You might feel\n<br><strong><font color=\"#47A8AD\">angry.</strong></font>";
            thoughtsModel252.text5 = "Your partner asked you whether you were working alone or with someone.";
            thoughtsModel252.text6 = "Your partner called a second time to check when you would be leaving.";
            thoughtsModel252.text7 = "Of late, your partner has been upset about you coming home late.";
            thoughtsModel252.text8 = "Your partner tends to worry about you easily.";
            thoughtsModel252.text9 = "Your partner has always been supportive of and understanding towards your work.";
            thoughtsModel252.text10 = "Your partner did not question you further or ask for any proof.";
            thoughtsModel252.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">My partner called me out of concern for me - not because they don't trust me.</strong></font>";
            thoughtsModel252.text12 = "You might now feel\n<strong><font color=\"#47A8AD\">contented.</strong></font>";
            thoughtsModel252.text13 = "Maybe your partner called you because they wanted to have dinner with you.";
            thoughtsModel252.text14 = "Your partner could have been worried about your safety, as it was quite late.";
            thoughtsModel252.text15 = "You may have checked on your partner too, had they been working late.";
            thoughtsModel252.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner called me out of concern for me - not because they don't trust me.</strong></font>";
            thoughtsModel252.text17 = "You might now feel\n<strong><font color=\"#47A8AD\">contented.</strong></font>";
            thoughtsModel2 = thoughtsModel252;
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
            ThoughtsModel thoughtsModel262 = new ThoughtsModel();
            thoughtsModel262.type = THOUGHTS_RELATIONSHIP;
            thoughtsModel262.distortion = THOUGHTS_ANGER_LABELLING;
            thoughtsModel262.GoalId = THOUGHT_GOAL_ID_LABELLING;
            thoughtsModel262.text1 = "You recently broke up with your partner.";
            thoughtsModel262.text2 = "Say this leads to negative thinking pattern - Labelling";
            thoughtsModel262.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">I am a failure.</strong></font>";
            thoughtsModel262.text4 = "You may feel\n<br><strong><font color=\"#47A8AD\">angry and depressed.</strong></font>";
            thoughtsModel262.text5 = "Your previous relationship did not work out either.";
            thoughtsModel262.text6 = "You tried very hard to make this relationship work.";
            thoughtsModel262.text7 = "Your best friend has been in a relationship for years and is gettting married.";
            thoughtsModel262.text8 = "You have been doing very well in various aspects of your life.";
            thoughtsModel262.text9 = "Your partner and you mutually decided to break up, as it was for the best.";
            thoughtsModel262.text10 = "Your partner often said that you were good to them in the relationship.";
            thoughtsModel262.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">Breaking up has been upsetting and disappointing, but it does not make me a failure.</strong></font>";
            thoughtsModel262.text12 = "You might now feel \n<strong><font color=\"#47A8AD\">hopeful and calm.</strong></font>";
            thoughtsModel262.text13 = "Not having a romantic relationship does not make you a failure.";
            thoughtsModel262.text14 = "You may have been more unhappy had you stayed in the relationship.";
            thoughtsModel262.text15 = "You may have broken up, but may still do well in other areas of your life.";
            thoughtsModel262.text16 = "You might now think\n<strong><font color=\"#33b5e5\">Breaking up has been upsetting and disappointing, but it does not make me a failure.</strong></font>";
            thoughtsModel262.text17 = "You might now feel \n<strong><font color=\"#47A8AD\">hopeful and calm.</strong></font>";
            thoughtsModel2 = thoughtsModel262;
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
            ThoughtsModel thoughtsModel272 = new ThoughtsModel();
            thoughtsModel272.type = THOUGHTS_RELATIONSHIP;
            thoughtsModel272.distortion = THOUGHTS_ANGER_BLAMING;
            thoughtsModel272.GoalId = "blaming";
            thoughtsModel272.text1 = "Your partner called to cancel your dinner as they had to work late.";
            thoughtsModel272.text2 = "Say this leads to negative thinking pattern - Blaming";
            thoughtsModel272.text3 = "You might think<br><strong><font color=\"#47A8AD\">My partner doesn't care about my feelings at all.</strong></font>";
            thoughtsModel272.text4 = "You may feel<br><strong><font color=\"#47A8AD\"> Angry</strong></font>";
            thoughtsModel272.text5 = "Your partner knew that you were looking forward to dinner.";
            thoughtsModel272.text6 = "Your partner had promised that they would be there.";
            thoughtsModel272.text7 = "Your partner didn't call you again after you said you were upset.";
            thoughtsModel272.text8 = "Your partner did not expect this meeting to abruptly come up.";
            thoughtsModel272.text9 = "Your partner apologised sincerely and promised to make it up to you.";
            thoughtsModel272.text10 = "Your partner had to go into the meeting immediately after you spoke.";
            thoughtsModel272.text11 = "You might now think<br><strong><font color=\"#33b5e5\">My partner cares about my feelings, and did not do this to hurt me.</strong></font>";
            thoughtsModel272.text12 = "You may feel <strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel272.text13 = "Just because your partner couldn't make it doesn't mean they don't care for you.";
            thoughtsModel272.text14 = "Your partner may have felt equally bad about missing the dinner.";
            thoughtsModel272.text15 = "Your partner might have tried to postpone the meeting but couldn't have.";
            thoughtsModel272.text16 = "You might now think\n<strong><font color=\"#33b5e5\">My partner cares about my feelings, and did not do this to hurt me.</strong></font>";
            thoughtsModel272.text17 = "You may feel <strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel2 = thoughtsModel272;
        }
        if (str.equals(THOUGHTS_RELATIONSHIP)) {
            ThoughtsModel thoughtsModel282 = new ThoughtsModel();
            thoughtsModel282.type = THOUGHTS_RELATIONSHIP;
            thoughtsModel282.distortion = THOUGHTS_ANGER_CATASTROPHISATION;
            thoughtsModel282.GoalId = THOUGHT_GOAL_ID_CATASTROPHISATION;
            thoughtsModel282.text1 = "Your partner and you had a big argument.";
            thoughtsModel282.text2 = "Say this leads to negative thinking pattern - Catastrophisation";
            thoughtsModel282.text3 = "You might think\n<br><strong><font color=\"#47A8AD\">My partner has completely ruined my life.</strong></font>";
            thoughtsModel282.text4 = "You might feel\n<br><strong><font color=\"#47A8AD\">angry.</strong></font>";
            thoughtsModel282.text5 = "Of late, your partner and you have been fighting frequently. ";
            thoughtsModel282.text6 = "You have been feeling more stressed at work due to the fights with your partner.";
            thoughtsModel282.text7 = "Your partner has not called to apologise or make amends.";
            thoughtsModel282.text8 = "Your partner and you have eventually always made up after a fight.";
            thoughtsModel282.text9 = "Despite the fights, your partner does a lot for you.";
            thoughtsModel282.text10 = "You still rely on your partner for emotional support.";
            thoughtsModel282.text11 = "You might now think\n<br><strong><font color=\"#33b5e5\">I am stressed out presenty, but my partner has not messed up my life completely.</strong></font>";
            thoughtsModel282.text12 = "You may now start feeling\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel282.text13 = "There could be reasons other than this fight that have stressed you out of late.";
            thoughtsModel282.text14 = "Just because your partner and you fight doesn't mean they have ruined your life.";
            thoughtsModel282.text15 = "It's okay for two to fight sometimes, as long as you two resolve the conflict.";
            thoughtsModel282.text16 = "You might now think\n<strong><font color=\"#33b5e5\">I am stressed out presently, but my partner has not messed up my life completely.</strong></font>";
            thoughtsModel282.text17 = "You may now start feeling\n<strong><font color=\"#47A8AD\">calm.</strong></font>";
            thoughtsModel2 = thoughtsModel282;
        }
        return !str.equals(THOUGHTS_RELATIONSHIP) ? thoughtsModel2 : thoughtsModel2;
    }

    public static HashMap<String, GoalType> getGoalsHashMap(String str) {
        HashMap<String, GoalType> hashMap = new HashMap<>();
        for (GoalType goalType : getGoals()) {
            if (goalType.getCourseList().contains(str)) {
                hashMap.put(goalType.getGoalId(), goalType);
            }
        }
        return hashMap;
    }

    public static List<GoalType> getGoals(String str, boolean z10, String str2) {
        ArrayList arrayList = new ArrayList();
        for (GoalType goalType : getGoals()) {
            if (goalType.getCourseList().contains(str) && goalType.isNegative() == z10 && goalType.getType().equals(str2)) {
                arrayList.add(goalType);
            }
        }
        return arrayList;
    }

    public static List<GoalType> getGoals(String str, boolean z10, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        for (GoalType goalType : getGoals()) {
            if (goalType.getCourseList().contains(str) && goalType.isNegative() == z10 && goalType.getType().equals(str2) && goalType.getSubtype().contains(str3)) {
                arrayList.add(goalType);
            }
        }
        return arrayList;
    }

    public static List<GoalType> getGoals(String str) {
        ArrayList arrayList = new ArrayList();
        for (GoalType goalType : getGoals()) {
            if (goalType.getCourseList().contains(str)) {
                arrayList.add(goalType);
            }
        }
        return arrayList;
    }

    public static ArrayList<GoalType> getCopingActivities() {
        ArrayList<GoalType> arrayList = new ArrayList<>();
        HashMap<String, String> courseNameIdMap = getCourseNameIdMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(courseNameIdMap.get(COURSE_STRESS));
        arrayList2.add(COURSE_STRESS);
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_HUMOUR_DISTRACTION, "Get A Good Laugh", "Get A Good Laugh", "Laughter can be beneficial as it lowers the levels of stress hormones in the body and simultaneously increases the levels of feel-good hormones.", "Get A Good Laugh", arrayList2, R.drawable.ic_laugh, "", "Laughter can be beneficial as it lowers the levels of stress hormones in the body and simultaneously increases the levels of feel-good hormones."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_FRESH_AIR, "Get Fresh Air", "Get Fresh Air", "Going outside not only exposes your body to sunlight, which gives you a vitamin D boost, but can also make you feel energised and reduce your feelings of stress.", "Get Fresh Air", arrayList2, R.drawable.fresh_air, "", "Going outside not only exposes your body to sunlight, which gives you a vitamin D boost, but can also make you feel energised and reduce your feelings of stress."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_TALKING_ABOUT_IT, "Talk About It", "Talk About It", "Talking about the problem gives you a chance to get support from others and helps you to see the problem in a different light.", "Talk About It", arrayList2, R.drawable.ic_talk, "", "Talking about the problem gives you a chance to get support from others and helps you to see the problem in a different light."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_STRESS_RUNNING, "Go For A Run", "Go For A Run", "Stress caused by negative, worrying thoughts could prevent you from sleeping well. Running improves sleep by reducing this stress.", "Go For A Run", arrayList2, R.drawable.ic_walking, "", "Stress caused by negative, worrying thoughts could prevent you from sleeping well. Running improves sleep by reducing this stress."));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(courseNameIdMap.get(COURSE_DEPRESSION));
        arrayList3.add(COURSE_DEPRESSION);
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_LISTEN_SOOTHING_MUSIC, "Listen to Soothing Music", "Listen to Soothing Music", "If you are feeling low, listening to soothing (or, if you prefer, cheerful) music can enhance your mood and lift your spirits.", "Listen to Soothing Music", arrayList3, R.drawable.ic_listen_to_soothing_music, "", "If you are feeling low, listening to soothing (or, if you prefer, cheerful) music can enhance your mood and lift your spirits."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_GOOD_LAUGH, "Get A Good Laugh", "Get A Good Laugh", "Laughing increases the level of dopamine in your brain - a chemical substance that elevates mood and reduces pain. Moreover, humor also reduces stress, helping you feel more relaxed.", "Get A Good Laugh", arrayList3, R.drawable.ic_get_good_laugh, "", "Laughing increases the level of dopamine in your brain - a chemical substance that elevates mood and reduces pain. Moreover, humor also reduces stress, helping you feel more relaxed."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_GET_ORGANISED, "Get Organised", "Get Organised", "When you are feeling low, spending some time sorting simple things out can instantly boost your mood. Changing your immediate surroundings to make things neater can be relaxing and rather uplifting.", "Get Organised", arrayList3, R.drawable.ic_index, "", "When you are feeling low, spending some time sorting simple things out can instantly boost your mood. Changing your immediate surroundings to make things neater can be relaxing and rather uplifting."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_GIVE_SOMEONE_HUG, "Give Someone A Hug", "Give Someone A Hug", "Studies show that touch reduces stress hormones and triggers the release of oxytocin, a chemical that makes you feel calm. A warm embrace reduces feelings of sadness and elevates your mood.", "Give Someone A Hug", arrayList3, R.drawable.ic_give_someone_hug, "", "Studies show that touch reduces stress hormones and triggers the release of oxytocin, a chemical that makes you feel calm. A warm embrace reduces feelings of sadness and elevates your mood."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_VIEW_OLD_PHOTO, "View Old Photos", "View Old Photos", "Research has found that viewing old photos when feeling low can instantly boost your mood and help you feel better.", "View Old Photos", arrayList3, R.drawable.ic_view_old_photos, "", "Research has found that viewing old photos when feeling low can instantly boost your mood and help you feel better."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_LEND_HELPING_HAND, "Lend A Helping Hand", "Lend A Helping Hand", "Helping others increases empathy, which helps you appreciate the good things in your own life - which in turn helps you feel better.", "Lend A Helping Hand", arrayList3, R.drawable.ic_lend_helping_hand, "", "Helping others increases empathy, which helps you appreciate the good things in your own life - which in turn helps you feel better."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_TALK_TO_A_FRIEND, "Talk to A Friend", "Talk to A Friend", "Reaching out to a trusted friend in times of sadness can help you feel better. Instead of bottling up your feelings, talking about them to someone can reduce negative feelings and help you feel happier.", "Talk to A Friend", arrayList3, R.drawable.ic_talk_to_friend, "", "Reaching out to a trusted friend in times of sadness can help you feel better. Instead of bottling up your feelings, talking about them to someone can reduce negative feelings and help you feel happier."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_TRY_SMILING, "Try Smiling", "Try Smiling", "Putting a smile on your face might seem like a very hard thing to do when you are feeling low, but studies show that smiling can make your brain believe that you are happy.", "Try Smiling", arrayList3, R.drawable.ic_try_smiling, "", "Putting a smile on your face might seem like a very hard thing to do when you are feeling low, but studies show that smiling can make your brain believe that you are happy."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_SPEND_TIME_IN_NATURE, "Spend Time in Nature", "Spend Time in Nature", "Spending time in nature can help you feel happy and reduce stress. When you are in nature, you are less likely to overthink about a problem - which will help you feel better.", "Spend Time in Nature", arrayList3, R.drawable.ic_spend_time_in_nature, "", "Spending time in nature can help you feel happy and reduce stress. When you are in nature, you are less likely to overthink about a problem - which will help you feel better."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_DEPRESSION_RUNNING, "Go For A Run", "Go For A Run", "A cardio exercise like running or jogging can increase the levels of feel good hormones - endorphins - in your brain which can help you feel joyful.", "Go For A Run", arrayList3, R.drawable.jogging, "", "A cardio exercise like running or jogging can increase the levels of feel good hormones - endorphins - in your brain which can help you feel joyful."));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(courseNameIdMap.get(COURSE_WORRY));
        arrayList4.add(COURSE_WORRY);
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_WORRY_DISTRACT_YOURSELF, "Distract Yourself", "Distract Yourself", "It is often difficult for your mind to focus on more than one thing at a time. If you are feeling worried, and there is nothing you can immediately do about it, put your mind elsewhere by distracting yourself.", "Distract Yourself", arrayList4, R.drawable.distract, "", "It is often difficult for your mind to focus on more than one thing at a time. If you are feeling worried, and there is nothing you can immediately do about it, put your mind elsewhere by distracting yourself."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_WORRY_GOOD_LAUGH, "Get A Good Laugh", "Get A Good Laugh", "Laughter produces a chemical reaction in your body that elevates your mood, reduces pain and stress, and thus helps you feel less worried. It can also help you get your mind off of a worrying situation.", "Get A Good Laugh", arrayList4, R.drawable.ic_get_good_laugh, "", "Laughter produces a chemical reaction in your body that elevates your mood, reduces pain and stress, and thus helps you feel less worried. It can also help you get your mind off of a worrying situation."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_WORRY_GET_ORGANISED, "Get Organised", "Get Organised", "When you are feeling worried, focussing your energy on getting organised and de-cluttering your immediate surroundings can help you feel calm and relaxed.", "Get Organised", arrayList4, R.drawable.ic_index, "", "When you are feeling worried, focussing your energy on getting organised and de-cluttering your immediate surroundings can help you feel calm and relaxed."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_WORRY_ENGAGE_IN_ENJOYABLE_ACTIVITIES, "Engage in Enjoyable Activities", "Engage in Enjoyable Activities", "Engaging in an activity that you find enjoyable will not only help you feel good, but will also serve as a distraction, thereby taking your mind off of what might be worrying you.", "Engage in Enjoyable Activities", arrayList4, R.drawable.ic_engage_in_enjoyable_activities, "", "Engaging in an activity that you find enjoyable will not only help you feel good, but will also serve as a distraction, thereby taking your mind off of what might be worrying you."));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(courseNameIdMap.get(COURSE_ANGER));
        arrayList5.add(COURSE_ANGER);
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_COUNT_TO_TEN, "Count to Ten", "Count to Ten", "If you are feeling angry, take a time out and count slowly from 1 to 10. This will give you some time to cool off and think in a clear and healthy way.", "Count to Ten", arrayList5, R.drawable.count_ten, "", "If you are feeling angry, take a time out and count slowly from 1 to 10. This will give you some time to cool off and think in a clear and healthy way."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_GOOD_LAUGH, "Get A Good Laugh", "Get A Good Laugh", "Laughing increases the level of dopamine in your brain - a chemical substance that helps you feel calmer, in control, and happier. It can also help you look at a situation in a more balanced way and think clearly.", "Get A Good Laugh", arrayList5, R.drawable.ic_get_good_laugh, "", "Laughing increases the level of dopamine in your brain - a chemical substance that helps you feel calmer, in control, and happier. It can also help you look at a situation in a more balanced way and think clearly."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_TALK_TO_A_FRIEND, "Talk to A Friend", "Talk to A Friend", "Instead of bottling up your anger, talking about a troubling situation to a trusted friend can help you think in a clearer way and release tension. As a result, you are also less likely to harbour negative feelings.", "Talk to A Friend", arrayList5, R.drawable.ic_talk_to_friend, "", "Instead of bottling up your anger, talking about a troubling situation to a trusted friend can help you think in a clearer way and release tension. As a result, you are also less likely to harbour negative feelings."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_SPEND_TIME_IN_NATURE, "Spend Time in Nature", "Spend Time in Nature", "When you are in nature, you are less likely to overthink about a problem - which will help you feel better and more in control. Spending time in greenery can help you experience a sense of calm.", "Spend Time in Nature", arrayList5, R.drawable.ic_spend_time_in_nature, "", "When you are in nature, you are less likely to overthink about a problem - which will help you feel better and more in control. Spending time in greenery can help you experience a sense of calm."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_GET_ORGANISED, "Get Organised", "Get Organised", "When you are feeling worried, focussing your energy on getting organised and de-cluttering your immediate surroundings can help you feel calm and relaxed.", "Get Organised", arrayList5, R.drawable.ic_index, "", "A good way to channelise your anger is by spending some time sorting or arranging things. Changing your immediate surroundings to make them neater can give you a sense of control, in turn helping you feel relaxed."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_CYCLING, "Cycling", "Cycling", "Cycling is an aerobic exercise that triggers the release of endorphins, which are hormones that have a mood-boosting effect on you. Moreover, cycling can also induce a sense of calm and well-being.", "Cycling", arrayList5, R.drawable.ic_cycling, "", "Cycling is an aerobic exercise that triggers the release of endorphins, which are hormones that have a mood-boosting effect on you. Moreover, cycling can also induce a sense of calm and well-being."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_LISTEN_SOOTHING_MUSIC, "Listen to Soothing Music", "Listen to Soothing Music", "Music can be a good source of comfort when you feel angry. It can induce positive emotions and help you feel calm.", "Listen to Soothing Music", arrayList5, R.drawable.ic_listen_to_soothing_music, "", "Music can be a good source of comfort when you feel angry. It can induce positive emotions and help you feel calm."));
        arrayList.add(new GoalType("physical_activity", false, ACTIVITY_ID_ANGER_WRITE_DOWN, "Write it Down", "Write it down", "If you're feeling angry, spend some time writing about what's bothering you. Writing gives you an opportunity to express your feelings and can thus help release pent-up anger.", "Write it down", arrayList5, R.drawable.write, "", "If you're feeling angry, spend some time writing about what's bothering you. Writing gives you an opportunity to express your feelings and can thus help release pent-up anger."));
        return arrayList;
    }

    public static ArrayList<GoalType> getActivities(String str) {
        ArrayList<GoalType> arrayList = new ArrayList<>();
        Iterator<GoalType> it = getActivities().iterator();
        while (it.hasNext()) {
            GoalType next = it.next();
            if (next.getCourseList().contains(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
