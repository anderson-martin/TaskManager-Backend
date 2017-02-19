package service.dao.userGroup;

import objectModels.msg.TMSIssue;
import objectModels.msg.TMSTask;
import objectModels.userGroup.HierarchyGroup;
import objectModels.userGroup.User;

import java.util.List;
import java.util.Set;

/**
 * Created by rohan on 2/14/17.
 */
public interface HierarchyGroupDAO {
    /**
     * Register a group, persisting it the databases
     * @param group a transient group object to be persisted
     * @return id of newly persisted object
     * @throws IllegalArgumentException if given group is not a transient object
     * @throws RuntimeException if given group's name is duplicate, or
     * because of other errors.
     */
    long registerGroup(HierarchyGroup group);

    boolean isRegisteredGroup(String group_name);
    boolean isRegisteredGroup(long id);


    void updateGroup(HierarchyGroup group);

    /**
     * Get group by its id
     * @param id id of the group to be retrieved
     * @return group with given id, and null if no such group exists
     */
    HierarchyGroup getGroup(long id);

    /**
     * Get group by its name
     * @param groupName name of the group to be retrieved
     * @return group with given name, and null if no such group exists
     */
    HierarchyGroup getGroup(String groupName);

    /**
     * Get group id by name
     * @param groupName
     * @return
     * @throws IllegalArgumentException if there does not exist a group with such name
     */
    long getGroupIdByName(String groupName);

    //
    Set<HierarchyGroup> getGroups(HierarchyGroup.STATUS... statuses);

    // this method is not of good value now
    // <T> Set<T> getGroups(Class<T> view, TMSIssue.STATUS... statuses);

    <T> Set<T> getSubordinateGroups(Class<T> view, long groupId, HierarchyGroup.STATUS... statuses);
    <T> T getManagerGroup(Class<T> view, long groupId);

    // UPDATE UTILITIES
    void setGroupStatus(long group_id, HierarchyGroup.STATUS status);
    void setManagerGroup(long managerGroup_id, long... subordinate_ids );
}
