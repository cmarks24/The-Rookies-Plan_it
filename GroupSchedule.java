
public class GroupSchedule {
    char members,greyscale,schedule,time;

    public char massGetSchedule() {
        return schedule;
    }
    public char formatGroupSchedule(){
        return members;
    }

    public char assertTimeBlocks(){
        return time;
    }
    public char colorAndGrayBlocks(){
        return greyscale;
    }

    public char fillBlockPopUps(){
        return 0;
    }
}

    class group extends GroupSchedule{
        char members, groupSchedule;

       public char getGroupSchedule(){
        return members;
        }

        class GroupPage extends GroupSchedule{
            char accordionMenu, groups;

            public char getUserGroups() {
            return groups;
            }
        }
        }
