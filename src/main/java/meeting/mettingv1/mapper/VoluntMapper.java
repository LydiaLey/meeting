package meeting.mettingv1.mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Volunt;
import pojo.VoluntExample;

import java.util.List;

public interface VoluntMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbggenerated Sat Nov 16 00:42:38 CST 2019
     */
    int countByExample(VoluntExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbggenerated Sat Nov 16 00:42:38 CST 2019
     */
    int deleteByExample(VoluntExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbggenerated Sat Nov 16 00:42:38 CST 2019
     */
    int insert(Volunt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbggenerated Sat Nov 16 00:42:38 CST 2019
     */
    int insertSelective(Volunt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbggenerated Sat Nov 16 00:42:38 CST 2019
     */
    List<Volunt> selectByExample(VoluntExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbggenerated Sat Nov 16 00:42:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") Volunt record, @Param("example") VoluntExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunt
     *
     * @mbggenerated Sat Nov 16 00:42:38 CST 2019
     */
    int updateByExample(@Param("record") Volunt record, @Param("example") VoluntExample example);
}