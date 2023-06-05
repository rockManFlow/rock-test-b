import logging
import datetime
import schedule
import threading

logging.basicConfig(level=logging.INFO, # 控制台打印的日志级别
                    filename='/data/logs/action.log',
                    filemode='a', # 模式，有w和a，w就是写模式，每次都会重新写日志，覆盖之前的日志 a是追加模式，默认如果不写的话，就是追加模式
                    format= '%(asctime)s - %(pathname)s[line:%(lineno)d] - %(levelname)s: %(message)s' #日志格式
                    )
def print_log(log_message):
    logging.info("info message:",log_message)
    logging.warning("warning message:",log_message)
    logging.error("error message:",log_message)

def process_work():
    now = datetime.datetime.now();
    ts = now.strftime('%Y-%m-%d %H:%M:%S')  # 格式化当前时间
    print_log(ts)

def run_threaded(job_func):
    job_thread = threading.Thread(target=job_func)
    job_thread.start()

def task_job():
    logging.info("start run task_job")

    # 定时来执行任务
    schedule.every(10).seconds.do(run_threaded, process_work)
    while True:
        schedule.run_pending()

    logging.info("end run task_job")