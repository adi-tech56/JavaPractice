package Exercise.LibraryNew1.Transaction;

import java.util.Date;

public class TransactionData {
    public static class Transaction{ private Long id;
        private String bookId;
        private String memberId;

        public Transaction(Long id, String bookId, String memberId) {
            this.id = id;
            this.bookId = bookId;
            this.memberId = memberId;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getBookId() {
            return bookId;
        }

        public void setBookId(String bookId) {
            this.bookId = bookId;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }
    }
   public static class IssueTransaction extends Transaction{
        private Date time;

        public IssueTransaction(Long id, String bookId, String memberId, Date time) {
            super(id, bookId, memberId);
            this.time = time;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "IssueTransaction{" +
                    "time=" + time +
                    ", id=" + super.getId()+
                    ", bookId='" + getBookId()+ '\'' +
                    ", memberId='" + getMemberId()+ '\'' +
                    '}';
        }
    }

   public static class ReturnTransaction extends Transaction {
        private Date time;

        public ReturnTransaction(Long id, String bookId, String memberId, Date time) {
            super(id, bookId, memberId);
            this.time = time;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "ReturnTransaction{" +
                    "time=" + time +
                    ", id=" + super.getId() +
                    ", bookId='" + super.getBookId() + '\'' +
                    ", memberId='" + super.getMemberId()+ '\'' +
                    '}';
        }
    }

}

