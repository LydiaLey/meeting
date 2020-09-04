package meeting.meetingv1.pojo;

import java.io.Serializable;
import java.util.Date;

public class Meeting implements Serializable {
    @Override
    public String toString() {
        return "Meeting{" +
                "meetingid=" + meetingid +
                ", mName='" + mName + '\'' +
                ", location='" + location + '\'' +
                ", startTime=" + startTime +
                ", closeTime=" + closeTime +
                ", introduction='" + introduction + '\'' +
                ", schedule='" + schedule + '\'' +
                ", needvolunteer=" + needvolunteer +
                ", typeid=" + typeid +
                ", organizer='" + organizer + '\'' +
                ", hostedby='" + hostedby + '\'' +
                ", communicate='" + communicate + '\'' +
                '}';
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.meetingid
     *
     * @mbg.generated
     */
    private Integer meetingid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.m_name
     *
     * @mbg.generated
     */
    private String mName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.location
     *
     * @mbg.generated
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.close_time
     *
     * @mbg.generated
     */
    private Date closeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.introduction
     *
     * @mbg.generated
     */
    private String introduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.schedule
     *
     * @mbg.generated
     */
    private String schedule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.needvolunteer
     *
     * @mbg.generated
     */
    private Integer needvolunteer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.typeid
     *
     * @mbg.generated
     */
    private Integer typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.organizer
     *
     * @mbg.generated
     */
    private String organizer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.hostedby
     *
     * @mbg.generated
     */
    private String hostedby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting.communicate
     *
     * @mbg.generated
     */
    private String communicate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    public Meeting(Integer meetingid, String mName, String location, Date startTime, Date closeTime, String introduction, String schedule, Integer needvolunteer, Integer typeid, String organizer, String hostedby, String communicate) {
        this.meetingid = meetingid;
        this.mName = mName;
        this.location = location;
        this.startTime = startTime;
        this.closeTime = closeTime;
        this.introduction = introduction;
        this.schedule = schedule;
        this.needvolunteer = needvolunteer;
        this.typeid = typeid;
        this.organizer = organizer;
        this.hostedby = hostedby;
        this.communicate = communicate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    public Meeting() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.meetingid
     *
     * @return the value of meeting.meetingid
     *
     * @mbg.generated
     */
    public Integer getMeetingid() {
        return meetingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.meetingid
     *
     * @param meetingid the value for meeting.meetingid
     *
     * @mbg.generated
     */
    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.m_name
     *
     * @return the value of meeting.m_name
     *
     * @mbg.generated
     */
    public String getmName() {
        return mName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.m_name
     *
     * @param mName the value for meeting.m_name
     *
     * @mbg.generated
     */
    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.location
     *
     * @return the value of meeting.location
     *
     * @mbg.generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.location
     *
     * @param location the value for meeting.location
     *
     * @mbg.generated
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.start_time
     *
     * @return the value of meeting.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.start_time
     *
     * @param startTime the value for meeting.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.close_time
     *
     * @return the value of meeting.close_time
     *
     * @mbg.generated
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.close_time
     *
     * @param closeTime the value for meeting.close_time
     *
     * @mbg.generated
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.introduction
     *
     * @return the value of meeting.introduction
     *
     * @mbg.generated
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.introduction
     *
     * @param introduction the value for meeting.introduction
     *
     * @mbg.generated
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.schedule
     *
     * @return the value of meeting.schedule
     *
     * @mbg.generated
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.schedule
     *
     * @param schedule the value for meeting.schedule
     *
     * @mbg.generated
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule == null ? null : schedule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.needvolunteer
     *
     * @return the value of meeting.needvolunteer
     *
     * @mbg.generated
     */
    public Integer getNeedvolunteer() {
        return needvolunteer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.needvolunteer
     *
     * @param needvolunteer the value for meeting.needvolunteer
     *
     * @mbg.generated
     */
    public void setNeedvolunteer(Integer needvolunteer) {
        this.needvolunteer = needvolunteer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.typeid
     *
     * @return the value of meeting.typeid
     *
     * @mbg.generated
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.typeid
     *
     * @param typeid the value for meeting.typeid
     *
     * @mbg.generated
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.organizer
     *
     * @return the value of meeting.organizer
     *
     * @mbg.generated
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.organizer
     *
     * @param organizer the value for meeting.organizer
     *
     * @mbg.generated
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer == null ? null : organizer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.hostedby
     *
     * @return the value of meeting.hostedby
     *
     * @mbg.generated
     */
    public String getHostedby() {
        return hostedby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.hostedby
     *
     * @param hostedby the value for meeting.hostedby
     *
     * @mbg.generated
     */
    public void setHostedby(String hostedby) {
        this.hostedby = hostedby == null ? null : hostedby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting.communicate
     *
     * @return the value of meeting.communicate
     *
     * @mbg.generated
     */
    public String getCommunicate() {
        return communicate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting.communicate
     *
     * @param communicate the value for meeting.communicate
     *
     * @mbg.generated
     */
    public void setCommunicate(String communicate) {
        this.communicate = communicate == null ? null : communicate.trim();
    }
}