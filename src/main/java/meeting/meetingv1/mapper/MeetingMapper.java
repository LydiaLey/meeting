package meeting.meetingv1.mapper;

import meeting.meetingv1.pojo.Meeting;
import meeting.meetingv1.pojo.MeetingExample;

import java.util.Date;
import java.util.Date;
import java.util.List;

public interface MeetingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer meetingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    int insert(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    int insertSelective(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    List<Meeting> selectByExample(MeetingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    Meeting selectByPrimaryKey(Integer meetingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Meeting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Meeting record);

    /*
     *
     *分页
     * */
    List<Meeting> selectMeetings(int offset, int limit);

    List<Meeting> selectMeetings(int offset, int limit, int orderMode, Date date);

    /*
     * 查询一共的行数
     * */
    int selectMeetingRows();


}