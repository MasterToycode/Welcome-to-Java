public class Some_try
{
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public String getChineseName() {
            switch (this) {
                case MONDAY:
                    return "星期一";
                case TUESDAY:
                    return "星期二";
                case WEDNESDAY:
                    return "星期三";
                case THURSDAY:
                    return "星期四";
                case FRIDAY:
                    return "星期五";
                case SATURDAY:
                    return "星期六";
                case SUNDAY:
                    return "星期日";
                default:
                    return "未知";
            }
        }
    }


    public static void main(String [] args)
    {
        Day todey=Day.FRIDAY;
        System.out.println(todey.getChineseName());
    }
}
