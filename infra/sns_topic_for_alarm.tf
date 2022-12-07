resource "aws_sns_topic" "alarms" {
  name = "alarm-topic-${var.candidate_id}"
}

/* 

### Kept getting Error: expected protocol to be one of [application http https lambda sms sqs], got email

resource "aws_sns_topic_subscription" "user_updates_sqs_target" {
  topic_arn = aws_sns_topic.alarms.arn
  protocol  = "email"
  endpoint  = var.candidate_email
}*/