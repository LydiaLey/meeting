package meeting.meetingv1.mapper;

import meeting.meetingv1.pojo.DriverGuestArengement;
import meeting.meetingv1.pojo.DriverGuestArengementExample;

import java.util.List;

public interface DriverGuestArengementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_guest_arengement
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer argId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_guest_arengement
     *
     * @mbg.generated
     */
    int insert(DriverGuestArengement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_guest_arengement
     *
     * @mbg.generated
     */
    int insertSelective(DriverGuestArengement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_guest_arengement
     *
     * @mbg.generated
     */
    List<DriverGuestArengement> selectByExample(DriverGuestArengementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_guest_arengement
     *
     * @mbg.generated
     */
    DriverGuestArengement selectByPrimaryKey(Integer argId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_guest_arengement
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DriverGuestArengement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_guest_arengement
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DriverGuestArengement record);
}